package by.training.controller;

import by.training.view.View;
import by.training.model.Model;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        model.saveNote(new Util(view, scanner).inputNote());
        View.printMessage(model.getNoteBook().toString());
    }

}
