package by.training;

import by.training.controller.Controller;
import by.training.model.Model;
import by.training.model.entity.Note;
import by.training.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
