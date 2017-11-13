package by.training.util.regex;

import java.util.ResourceBundle;

public interface RegexConstants {
    String regularExpressions = "regularExpressions";
    ResourceBundle constants = ResourceBundle.getBundle(regularExpressions);

    String EMAIL_REGEX = constants.getString("EMAIL_REGEX");
    String NAME_REGEX = constants.getString("NAME_REGEX");
    String NICKNAME_REGEX = constants.getString("NICKNAME_REGEX");
    String HOME_NUMBER_REGEX = constants.getString("HOME_NUMBER_REGEX");
    String MOBILE_NUMBER1_REGEX = constants.getString("MOBILE_NUMBER1_REGEX");
    String MOBILE_NUMBER2_REGEX = constants.getString("MOBILE_NUMBER2_REGEX");
    String SKYPE_REGEX = constants.getString("SKYPE_REGEX");
    String INDEX_REGEX = constants.getString("INDEX_REGEX");
    String TOWN_REGEX = constants.getString("TOWN_REGEX");
    String STREET_REGEX = constants.getString("STREET_REGEX");
    String HOUSE_NUMBER_REGEX = constants.getString("HOUSE_NUMBER_REGEX");
    String APARTMENT_NUMBER_REGEX = constants.getString("APARTMENT_NUMBER_REGEX");

}
