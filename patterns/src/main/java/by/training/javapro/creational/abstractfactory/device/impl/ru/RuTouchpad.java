package by.training.javapro.creational.abstractfactory.device.impl.ru;

import by.training.javapro.creational.abstractfactory.device.Touchpad;

public class RuTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Передвинулись на " +
                Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2))
                + "px");
    }
}
