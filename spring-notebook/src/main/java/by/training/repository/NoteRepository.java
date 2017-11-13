package by.training.repository;

import by.training.model.Note;
import by.training.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface NoteRepository extends CrudRepository<Note, Long> {
    Set<Note> findAllByUserId(Long id);
    Optional<Note> findById(Long id);

}
