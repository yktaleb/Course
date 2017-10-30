package by.training.view;

public class View {

    public void printMessage(String...messages) {
        for (String message : messages) {
            System.out.print(message + " ");
        }
    }
}
