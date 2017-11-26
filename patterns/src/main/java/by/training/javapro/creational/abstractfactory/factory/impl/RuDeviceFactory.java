package by.training.javapro.creational.abstractfactory.factory.impl;

import by.training.javapro.creational.abstractfactory.device.Keyboard;
import by.training.javapro.creational.abstractfactory.device.Mouse;
import by.training.javapro.creational.abstractfactory.device.Touchpad;
import by.training.javapro.creational.abstractfactory.device.impl.ru.RuKeyBoard;
import by.training.javapro.creational.abstractfactory.device.impl.ru.RuMouse;
import by.training.javapro.creational.abstractfactory.device.impl.ru.RuTouchpad;
import by.training.javapro.creational.abstractfactory.factory.DeviceFacroty;

public class RuDeviceFactory implements DeviceFacroty {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyBoard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
