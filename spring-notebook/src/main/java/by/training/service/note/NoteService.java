package by.training.service.note;

import by.training.model.Note;
import by.training.model.User;

import java.util.Optional;
import java.util.Set;

public interface NoteService {
    Set<Note> findAllByUserId(Long id);
    Note save(Note note);
    Optional<Note> findById(Long id);
    boolean checkAllFields(Note note);
}
