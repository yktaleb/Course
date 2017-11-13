package by.training.service.note;

import by.training.model.Note;
import by.training.model.User;
import by.training.repository.NoteRepository;
import by.training.util.regex.RegexConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Set<Note> findAllByUserId(Long id) {
        return noteRepository.findAllByUserId(id);
    }

    @Override
    public Note save(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Optional<Note> findById(Long id) {
        return noteRepository.findById(id);
    }

    @Override
    public boolean checkAllFields(Note note) {
        if (note.getEmail().matches(RegexConstants.EMAIL_REGEX)
                && note.getName().matches(RegexConstants.NAME_REGEX)
                && note.getNickname().matches(RegexConstants.NICKNAME_REGEX)
                && note.getHomePhone().matches(RegexConstants.HOME_NUMBER_REGEX)
                && note.getMobilePhone1().matches(RegexConstants.MOBILE_NUMBER1_REGEX)
                && note.getMobilePhone2().matches(RegexConstants.MOBILE_NUMBER2_REGEX)
                && note.getSkype().matches(RegexConstants.SKYPE_REGEX)
                && note.getAddress().getIndex().matches(RegexConstants.INDEX_REGEX)
                && note.getAddress().getCity().matches(RegexConstants.TOWN_REGEX)
                && note.getAddress().getStreet().matches(RegexConstants.STREET_REGEX)
                && note.getAddress().getBuilding().matches(RegexConstants.HOUSE_NUMBER_REGEX)
                && note.getAddress().getApartmentNumber().matches(RegexConstants.APARTMENT_NUMBER_REGEX)) {
            return true;
        }
        return false;
    }
}
