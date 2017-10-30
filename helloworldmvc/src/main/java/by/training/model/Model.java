package by.training.model;

public class Model {
    private StringBuilder message;

    public Model() {
        message = new StringBuilder();
    }

    public void addMessage(String message) {
        this.message
                .append(message)
                .append(" ");
    }

    public String getMessage() {
        return message.toString();
    }
}
