package by.training.javapro.creational.abstractfactory.device.impl.ru;

import by.training.javapro.creational.abstractfactory.device.Mouse;

public class RuMouse implements Mouse {
    @Override
    public void scroll(int direction) {
        if (direction > 0 ) {
            System.out.println("Вверх");
        } else if (direction < 0) {
            System.out.println("Вниз");
        } else {
            System.out.println("Не скролим");
        }
    }

    @Override
    public void click() {
        System.out.println("Клик");
    }
}
