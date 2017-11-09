package by.training;

import by.training.controller.Controller;
import by.training.model.Model;
import by.training.view.View;

public class Main {
    public static void main(String[] args) {
        System.out.println(1+2+"test");
        System.out.println("test"+1+2);
        int x = 3;
        System.out.println("x = " + x);
        Model model = new Model();
        model.setRandMax(100);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser(5, 89);
    }
}
