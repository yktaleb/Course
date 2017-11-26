package by.training.javapro.creational.builder.difficult;

public class Director {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar() {
        carBuilder.createCar();
        carBuilder.setMake();
        carBuilder.setTransmission();
        carBuilder.setMaxSpeed();
        return carBuilder.getCar();
    }
}
