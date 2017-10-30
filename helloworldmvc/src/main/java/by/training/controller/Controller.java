package by.training.controller;

import by.training.model.Model;
import by.training.util.Constants;
import by.training.view.View;

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

        inputWordFromConsole(sc, Constants.WORD_HELLO);
        inputWordFromConsole(sc, Constants.WORD_WORLD);

        view.printMessage(Constants.OUTPUT_MESSAGE, model.getMessage());
    }

    // The Utility methods
    private void inputWordFromConsole(Scanner sc, String str) {
        view.printMessage(Constants.INPUT_MESSAGE, "\n");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.compareToIgnoreCase(str) == 0) {
                model.addMessage(line);
                view.printMessage(Constants.RIGHT_INPUT_MESSAGE, "\n");
                break;
            } else {
                view.printMessage(Constants.WRONG_INPUT_MESSAGE, "\n");
            }
        }
    }
}
