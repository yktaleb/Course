package by.training.service.user;

import by.training.exception.UserAlreadyExists;
import by.training.model.Note;
import by.training.model.Role;
import by.training.model.User;
import by.training.repository.NoteRepository;
import by.training.repository.RoleRepository;
import by.training.repository.UserRepository;
import by.training.service.note.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final NoteService noteService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           BCryptPasswordEncoder bCryptPasswordEncoder,
                           NoteService noteService) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.noteService = noteService;
    }

    @Override
    public void registerUser(User user) throws UserAlreadyExists {
        try {
            setUserRoles(user, Collections.singleton("USER_ROLE"));
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            userRepository.save(user);
        } catch (DataIntegrityViolationException e) {
            throw new UserAlreadyExists("User already exists");
        }
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User createNote(Long userId, Note note) {
        User user = userRepository.findById(userId).get();
        note.setUser(user);
        noteService.save(note);
        return user;
    }

    @Override
    public User addNote(Long userId,Long noteId) {
        Note note = noteService.findById(noteId).get();
        User user = userRepository.findById(userId).get();
        note.setUser(user);
        noteService.save(note);
        return user;
    }

    @Override
    public Set<Note> findAllNotes(Long id) {
        return noteService.findAllByUserId(id);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByLogin(username).orElseThrow(
                () -> new UsernameNotFoundException("user " + username + " was not found!"));
    }

    private void setUserRoles(User user, Set<String> roles) {
        user.setRoles(new HashSet<>());
        roles.forEach(name -> {
            Role role = roleRepository.findByName(name);
            if (role != null) {
                user.getRoles().add(role);
            } else {
//                log.error("Cannot find role " + roleName);
            }
        });
    }
}
