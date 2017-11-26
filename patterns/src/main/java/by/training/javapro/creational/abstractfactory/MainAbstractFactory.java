package by.training.javapro.creational.abstractfactory;

import by.training.javapro.creational.abstractfactory.device.Keyboard;
import by.training.javapro.creational.abstractfactory.device.Mouse;
import by.training.javapro.creational.abstractfactory.device.Touchpad;
import by.training.javapro.creational.abstractfactory.factory.DeviceFacroty;
import by.training.javapro.creational.abstractfactory.factory.impl.EnDeviceFactory;
import by.training.javapro.creational.abstractfactory.factory.impl.RuDeviceFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        DeviceFacroty deviceFacroty = getFactoryByName("EN");

        Mouse mouse = deviceFacroty.getMouse();
        Keyboard keyboard = deviceFacroty.getKeyboard();
        Touchpad touchpad = deviceFacroty.getTouchpad();

        mouse.click();
        keyboard.println();
        touchpad.track(3, 1);
    }

    private static DeviceFacroty getFactoryByName(String factoryName) {
        if ("en".equalsIgnoreCase(factoryName)) {
            return new EnDeviceFactory();
        } else if ("ru".equalsIgnoreCase(factoryName)) {
            return new RuDeviceFactory();
        }

        throw new RuntimeException("Not supported factory");
    }
}
