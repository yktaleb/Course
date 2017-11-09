package by.training.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoteBook {

    private List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    @Override
    public String toString() {
        return notes.stream()
                .map(note -> note.toString())
                .collect(Collectors.joining("\n"));
    }
}
