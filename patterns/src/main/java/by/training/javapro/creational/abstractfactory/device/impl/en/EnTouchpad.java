package by.training.javapro.creational.abstractfactory.device.impl.en;

import by.training.javapro.creational.abstractfactory.device.Touchpad;

import java.util.Map;

public class EnTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Moved " +
                Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2))
                + "px");
    }
}
