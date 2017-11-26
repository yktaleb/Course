package by.training.javapro.creational.abstractfactory.factory;

import by.training.javapro.creational.abstractfactory.device.Keyboard;
import by.training.javapro.creational.abstractfactory.device.Mouse;
import by.training.javapro.creational.abstractfactory.device.Touchpad;

public interface DeviceFacroty {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
