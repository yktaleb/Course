package by.training.model;

import by.training.model.entity.Note;
import by.training.model.entity.NoteBook;

public class Model {

    private NoteBook noteBook;

    public Model() {
        noteBook = new NoteBook();
    }

    public void saveNote(Note note) {
        noteBook.addNote(note);
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }
}
