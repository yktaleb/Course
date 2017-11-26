package by.training.javapro.creational.builder.difficult;

public abstract class CarBuilder {
    Car car;

    abstract void setMake();
    abstract void setTransmission();
    abstract void setMaxSpeed();

    void createCar() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }
}
