package by.training.javapro.creational.abstractfactory.factory.impl;

import by.training.javapro.creational.abstractfactory.device.Keyboard;
import by.training.javapro.creational.abstractfactory.device.Mouse;
import by.training.javapro.creational.abstractfactory.device.Touchpad;
import by.training.javapro.creational.abstractfactory.device.impl.en.EnKeyboard;
import by.training.javapro.creational.abstractfactory.device.impl.en.EnMouse;
import by.training.javapro.creational.abstractfactory.device.impl.en.EnTouchpad;
import by.training.javapro.creational.abstractfactory.factory.DeviceFacroty;

public class EnDeviceFactory implements DeviceFacroty {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
