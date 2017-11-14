package by.training.controller;

public final class RegularExpressions {
    static String EMAIL = "^[a-zA-Z0-9.!#$%&'*+\\/=?^_`\\{|\\}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    static String NAME = "^[A-Z]{1}[a-z]{1,15}$";
    static String NICKNAME = "^.{1,15}$";
    static String HOME_NUMBER = "^[0-9]+$";
    static String MOBILE_NUMBER1 = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";//"^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    static String MOBILE_NUMBER2 = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*|skip$"; //"^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|skip$";
    static String SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    static String INDEX = "^[\\d]{5}$";
    static String TOWN = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    static String STREET = "^[A-Z]{1}[a-z]{1,20}$";
    static String HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    static String APARTMENT_NUMBER = "^[\\d]{1,3}";
}
