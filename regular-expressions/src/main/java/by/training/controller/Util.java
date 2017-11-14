package by.training.controller;

import by.training.model.entity.*;
import by.training.util.Constants;
import by.training.view.View;

import java.util.Arrays;
import java.util.Scanner;

public class Util {

    private View view;
    private Scanner scanner;

    public Util() {
    }

    public Util(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    private String inputValueWithChecking(String regex) {
        String value = scanner.next();
        while (!(value.matches(regex))) {
            view.printMessage(Constants.WRONG_INPUT_MESSAGE, "\n");
            value = scanner.next();
        }
        return value;
    }

    public Note inputNote() {
        Note note = new Note();
        note.setSubscriber(inputSubscriber());
        note.setComment(inputComment());
        return note;
    }

    private Subscriber inputSubscriber() {
        Subscriber subscriber = new Subscriber();

        view.printMessage(Constants.INPUT_NAME, "\n");
        subscriber.setName(inputValueWithChecking(RegularExpressions.NAME));
        view.printMessage(Constants.INPUT_SURNAME, "\n");
        subscriber.setSurname(inputValueWithChecking(RegularExpressions.NAME));
        view.printMessage(Constants.INPUT_PATRONYMIC, "\n");
        subscriber.setPatronymic(inputValueWithChecking(RegularExpressions.NAME));
        view.printMessage(Constants.INPUT_NICKNAME, "\n");
        subscriber.setNickname(inputValueWithChecking(RegularExpressions.NICKNAME));
        subscriber.setContacts(inputContacts());
        subscriber.setGroup(inputGroup());
        subscriber.setAddress(inputAddress());

        return subscriber;
    }

    private Contacts inputContacts() {
        String homePhone;
        String mobilePhone1;
        String mobilePhone2;
        String email;
        String skype;

        view.printMessage(Constants.INPUT_HOME_PHONE, "\n");
        homePhone = inputValueWithChecking(RegularExpressions.HOME_NUMBER);
        view.printMessage(Constants.INPUT_MOBILE_PHONE1, "\n");
        mobilePhone1 = inputValueWithChecking(RegularExpressions.MOBILE_NUMBER1);
        view.printMessage(Constants.INPUT_MOBILE_PHONE2, "\n");
        mobilePhone2 = inputValueWithChecking(RegularExpressions.MOBILE_NUMBER2);
        if (mobilePhone1.equals("skip")) {
            mobilePhone2 = "";
        }
        view.printMessage(Constants.INPUT_EMAIL, "\n");
        email = inputValueWithChecking(RegularExpressions.EMAIL);
        view.printMessage(Constants.INPUT_SKYPE, "\n");
        skype = inputValueWithChecking(RegularExpressions.SKYPE);

        return new Contacts(homePhone, mobilePhone1, mobilePhone2, email, skype);
    }

    private Group inputGroup() {
        String value;

        while (true) {
            view.printMessage(Constants.INPUT_GROUP);
            view.printMessage(Arrays.toString(Group.values()), "\n");
            value = scanner.next();
            try {
                Group group = Group.fromString(value);
                if (group != null) {
                    return group;
                }
            } catch (IllegalArgumentException ex) {
                view.printMessage(Constants.WRONG_INPUT_MESSAGE);
            }
        }
    }

    private Address inputAddress() {
        String index;
        String city;
        String street;
        String building;
        String apartmentNumber;

        view.printMessage(Constants.INPUT_INDEX, "\n");
        index = inputValueWithChecking(RegularExpressions.INDEX);
        view.printMessage(Constants.INPUT_CITY, "\n");
        city = inputValueWithChecking(RegularExpressions.TOWN);
        view.printMessage(Constants.INPUT_STREET, "\n");
        street = inputValueWithChecking(RegularExpressions.STREET);
        view.printMessage(Constants.INPUT_BUILDING, "\n");
        building = inputValueWithChecking(RegularExpressions.HOUSE_NUMBER);
        view.printMessage(Constants.INPUT_APARTMENT_NUMBER, "\n");
        apartmentNumber = inputValueWithChecking(RegularExpressions.APARTMENT_NUMBER);

        return new Address(index, city, street, building, apartmentNumber);
    }

    private String inputComment() {
        String comment;

        view.printMessage(Constants.INPUT_COMMENT, "\n");

        while (true) {
            comment = scanner.next();
            if (!comment.isEmpty()) {
                return comment;
            }
        }
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }


}
