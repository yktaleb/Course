package by.training.javapro.creational.factorymethod;

import sun.util.resources.LocaleData;

import java.time.LocalDateTime;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(LocalDateTime.now());
    }
}
