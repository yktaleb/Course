package by.training.javapro.creational.abstractfactory.device.impl.ru;

import by.training.javapro.creational.abstractfactory.device.Keyboard;

public class RuKeyBoard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печать без перевода на новую строку");
    }

    @Override
    public void println() {
        System.out.println("Печать с переводом на новую строку");
    }
}
