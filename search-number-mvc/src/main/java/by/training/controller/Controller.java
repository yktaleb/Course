package by.training.controller;

import by.training.model.Model;
import by.training.util.Constants;
import by.training.view.View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        List indexesByValue = model.getIndexesByValue(inputValueFromConsole(sc));

        view.printMessage(Arrays.toString(model.getArray()), "\n");
        view.printMessage(Constants.OUTPUT_MESSAGE, indexesByValue.toString());
    }

    // The Utility methods
    private int inputValueFromConsole(Scanner sc) {
        view.printMessage(Constants.INPUT_MESSAGE, "\n");
        while(!sc.hasNextInt()) {
            view.printMessage(Constants.WRONG_INPUT_MESSAGE, "\n");
            sc.next();
        }
        view.printMessage(Constants.RIGHT_INPUT_MESSAGE, "\n");
        return sc.nextInt();
    }
}
