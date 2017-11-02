package by.training.util;

import java.util.ResourceBundle;

public interface Constants {
    String applicationPropertyName = "application";
    ResourceBundle constants = ResourceBundle.getBundle(applicationPropertyName);

    String INPUT_MESSAGE = constants.getString("input_message");
    String WRONG_INPUT_MESSAGE = constants.getString("wrong_input_message");
    String RAND_MAX_NOT_FOUND_EXCEPTION = constants.getString("rand_max_not_found_exception");
    String MORE_MESSAGE = constants.getString("more_message");
    String LESS_MESSAGE = constants.getString("less_message");
    String CONGRATULATORY_MESSAGE = constants.getString("congratulatory_message");
    String HISTORY_OF_ATTEMPTS = constants.getString("history_of_attempts");
    String NUMBER_OF_ATTEMPTS = constants.getString("number_of_attempts");
    String GUESSING_NUMBER = constants.getString("guessing_number");
    String BORDERS = constants.getString("borders");
    String STATISTIC = constants.getString("statistic");
    Integer ZERO = 0;
}
