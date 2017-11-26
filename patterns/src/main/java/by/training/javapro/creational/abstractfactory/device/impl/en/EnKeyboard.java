package by.training.javapro.creational.abstractfactory.device.impl.en;

import by.training.javapro.creational.abstractfactory.device.Keyboard;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print without new line");
    }

    @Override
    public void println() {
        System.out.println("Print with new line");
    }
}
