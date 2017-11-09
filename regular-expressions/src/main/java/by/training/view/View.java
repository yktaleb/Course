package by.training.view;

public class View {

    public static void printMessage(String...messages) {
        System.out.print(mergeMessages(messages));
    }

    public static void printMessage(String message) {
        System.out.print(message);
    }

    private static StringBuilder mergeMessages(String...messages) {
        StringBuilder resultMessage = new StringBuilder();
        for (String message : messages) {
            resultMessage.append(message);
        }
        return resultMessage;
    }
}
