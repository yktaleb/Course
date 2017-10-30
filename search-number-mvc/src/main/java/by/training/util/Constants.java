package by.training.util;

import java.util.ResourceBundle;

public interface Constants {
    String applicationPropertyName = "application";
    ResourceBundle constants = ResourceBundle.getBundle(applicationPropertyName);

    String INPUT_MESSAGE = constants.getString("input_message");
    String WRONG_INPUT_MESSAGE = constants.getString("wrong_input_message");
    String RIGHT_INPUT_MESSAGE = constants.getString("right_input_message");
    String OUTPUT_MESSAGE = constants.getString("output_message");
}
