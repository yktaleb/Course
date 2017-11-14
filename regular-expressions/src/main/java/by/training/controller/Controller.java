package by.training.controller;

import by.training.exception.LoginAlreadyExistsException;
import by.training.exception.LoginNotFoundException;
import by.training.util.Constants;
import by.training.view.View;
import by.training.model.Model;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        Util util = new Util(view, scanner);
        while (true) {
            chooseAction(scanner, util);
        }
    }

    private void chooseAction(Scanner scanner, Util util) {
        String login = authorization(scanner);
        while (true) {
            view.printMessage(Constants.ACTIONS, "\n");
            String line = scanner.next();
            if (line.equals(Constants.ACTION_ADD)) {
                model.saveNote(login, util.inputNote());
            } else if (line.equals(Constants.ACTION_GET_ALL)) {
                view.printMessage(model.getUser(login).get().getNotes().toString());
            } else if (line.equals(Constants.ACTION_EXIT)) {
                break;
            } else {
                view.printMessage(Constants.WRONG_INPUT_MESSAGE, "\n");
            }
        }
    }

    private String authorization(Scanner scanner) {
        while (true) {
            view.printMessage(Constants.INPUT_AUTHORIZATION, "\n");
            String line = scanner.next();
            if (line.equals(Constants.CHOOSE_REGISTRATION)) {
                try {
                    return createAccount(scanner);
                } catch (LoginAlreadyExistsException e) {
                    System.err.println(e.getMessage()  + " " + e.getLogin());
//                    view.printMessage(e.getMessage());
                }
            } else if (line.equals(Constants.CHOOSE_LOGIN)) {
                try {
                    return login(scanner);
                } catch (LoginNotFoundException e) {
                    System.err.println(e.getMessage() + " " + e.getLogin());
//                    view.printMessage(e.getMessage());
                }
            }
        }
    }

    private String login(Scanner scanner) throws LoginNotFoundException {
        view.printMessage(Constants.INPUT_LOGIN, "\n");
        String login = null;
        while (scanner.hasNext()) {
            login = scanner.next();
            if (model.getUser(login).orElse(null) == null) {
                throw new LoginNotFoundException(login, Constants.LOGIN_NOT_FOUND);
            } else {
                return login;
            }
        }
        return login;
    }

    private String createAccount(Scanner scanner) throws LoginAlreadyExistsException {
        view.printMessage(Constants.INPUT_NEW_LOGIN, "\n");
        String newLogin = null;
        while (scanner.hasNext()) {
            newLogin = scanner.next();
            addUser(newLogin);
            break;
        }
        return newLogin;
    }

    private void addUser(String login) throws LoginAlreadyExistsException {
        if (model.getUser(login).orElse(null) != null) {
            throw new LoginAlreadyExistsException(login, Constants.LOGIN_ALREADY_EXISTS);
        } else {
            model.registerUser(login);
        }
    }

}
