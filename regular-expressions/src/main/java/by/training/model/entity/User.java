package by.training.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {

    private String login;

    private List<Note> notes = new ArrayList<>();

    public User() {
    }

    public User(String login, List<Note> notes) {
        this.login = login;
        this.notes = notes;
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return notes.stream()
                .map(note -> note.toString())
                .collect(Collectors.joining("\n"));
    }
}
