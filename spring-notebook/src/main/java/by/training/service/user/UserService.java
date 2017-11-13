package by.training.service.user;

import by.training.exception.UserAlreadyExists;
import by.training.model.Note;
import by.training.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;
import java.util.Set;

public interface UserService extends UserDetailsService {
    void registerUser(User user) throws UserAlreadyExists;

    Optional<User> findById(Long id);

    User createNote(Long userId, Note note);

    User addNote(Long userId, Long noteId);

    Set<Note> findAllNotes(Long id);
}
