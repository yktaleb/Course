package by.training.javapro.creational.abstractfactory.device.impl.en;

import by.training.javapro.creational.abstractfactory.device.Mouse;

public class EnMouse implements Mouse {
    @Override
    public void scroll(int direction) {
        if (direction > 0 ) {
            System.out.println("Up");
        } else if (direction < 0) {
            System.out.println("Down");
        } else {
            System.out.println("No scrolling");
        }
    }

    @Override
    public void click() {
        System.out.println("Click");
    }
}
