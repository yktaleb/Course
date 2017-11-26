package by.training.javapro.creational.builder.difficult;

import by.training.javapro.creational.builder.easy.Transmission;

public class LexusBuilder extends CarBuilder {
    @Override
    void setMake() {
        car.setMake("Lexus");
    }

    @Override
    void setTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void setMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
