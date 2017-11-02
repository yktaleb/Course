package by.training.controller;

import by.training.model.Model;
import by.training.util.Constants;
import by.training.view.View;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Controller {
    private Model model;
    private View view;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        try {
            model.generateGuessNumber();
            gameLogic(sc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void processUser(Integer min, Integer max) {
        Scanner sc = new Scanner(System.in);
        model.generateGuessNumber(min, max);
        gameLogic(sc);
    }

    private void gameLogic(Scanner sc) {
        Integer inputValue;
        do {
            inputValue = inputValueFromConsole(sc);
            model.addValueToUserAttempts(inputValue);
            view.printMessage(getMessageCheckNumber(inputValue), "\n");
            view.printMessage(Constants.HISTORY_OF_ATTEMPTS, model.getUserAttempts().toString(), "\n");
            view.printMessage(Constants.BORDERS, model.getBorders(), "\n");
        } while (!inputValue.equals(model.getGuessNumber()));
        view.printMessage("\n", Constants.CONGRATULATORY_MESSAGE, "\n");
        generateStatistic();
    }

    private void generateStatistic() {
        view.printMessage(Constants.STATISTIC, "\n",
                Constants.BORDERS, model.getBorders(), "\n",
                Constants.HISTORY_OF_ATTEMPTS, model.getUserAttempts().toString(), "\n",
                Constants.NUMBER_OF_ATTEMPTS, String.valueOf(model.getUserAttempts().size()), "\n",
                Constants.GUESSING_NUMBER, model.getGuessNumber().toString());
    }

    private String getMessageCheckNumber(Integer value) {
        int result = model.checkNumber(value);
        if (result == 0) {
            return Constants.CONGRATULATORY_MESSAGE;
        } else if (result == -1) {
            return  Constants.MORE_MESSAGE;
        } else {
            return Constants.LESS_MESSAGE;
        }
    }

    private int inputValueFromConsole(Scanner sc) {
        view.printMessage(Constants.INPUT_MESSAGE, "\n");
        while(!sc.hasNextInt()) {
            view.printMessage(Constants.WRONG_INPUT_MESSAGE, "\n");
            sc.next();
        }
        return sc.nextInt();
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
