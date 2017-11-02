package by.training;

import by.training.controller.Controller;
import by.training.model.Model;
import by.training.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.setRandMax(100);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser(5, 89);

    }
}
