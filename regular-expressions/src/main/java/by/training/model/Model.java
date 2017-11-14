package by.training.model;

import by.training.model.entity.Note;
import by.training.model.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Model {

    private List<User> users = new ArrayList<>();

    public void registerUser(String login) {
        users.add(new User(login, new ArrayList<>()));
    }

    public void saveNote(String login, Note note) {
        getUser(login).get().addNote(note);
    }

    public Optional<User> getUser(String login) {
        return users.stream().filter(user -> user.getLogin().equals(login)).findFirst();
    }
}
