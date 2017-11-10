package by.training;

import by.training.controller.Controller;
import by.training.model.Model;
import by.training.view.View;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4};
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
