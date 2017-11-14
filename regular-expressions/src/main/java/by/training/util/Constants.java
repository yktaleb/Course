package by.training.util;

import java.util.ResourceBundle;

public interface Constants {
    String applicationPropertyName = "application";
    ResourceBundle constants = ResourceBundle.getBundle(applicationPropertyName);

    String WRONG_INPUT_MESSAGE = constants.getString("wrong_input_message");
    String INPUT_NAME = constants.getString("input_name");
    String INPUT_SURNAME = constants.getString("input_surname");
    String INPUT_PATRONYMIC = constants.getString("input_patronymic");
    String INPUT_NICKNAME = constants.getString("input_nickname");
    String INPUT_HOME_PHONE = constants.getString("input_home_phone");
    String INPUT_MOBILE_PHONE1 = constants.getString("input_mobile_phone1");
    String INPUT_MOBILE_PHONE2 = constants.getString("input_mobile_phone2");
    String INPUT_EMAIL = constants.getString("input_email");
    String INPUT_SKYPE = constants.getString("input_skype");
    String INPUT_INDEX = constants.getString("input_index");
    String INPUT_CITY = constants.getString("input_city");
    String INPUT_STREET = constants.getString("input_street");
    String INPUT_BUILDING = constants.getString("input_building");
    String INPUT_APARTMENT_NUMBER = constants.getString("input_apartment_number");
    String INPUT_COMMENT = constants.getString("input_comment");
    String INPUT_GROUP = constants.getString("input_group");
    String INPUT_AUTHORIZATION = constants.getString("input_authorization");
    String CHOOSE_REGISTRATION = constants.getString("choose_registration");
    String CHOOSE_LOGIN = constants.getString("choose_login");
    String CHOOSE_EXIT = constants.getString("choose_exit");
    String INPUT_NEW_LOGIN = constants.getString("input_new_login");
    String INPUT_LOGIN = constants.getString("input_login");
    String LOGIN_ALREADY_EXISTS = constants.getString("login_already_exists");
    String LOGIN_NOT_FOUND = constants.getString("login_not_found");
    String ACTIONS = constants.getString("actions");
    String ACTION_ADD = constants.getString("action_add");
    String ACTION_GET_ALL = constants.getString("action_get_all");
    String ACTION_EXIT = constants.getString("action_exit");
}
