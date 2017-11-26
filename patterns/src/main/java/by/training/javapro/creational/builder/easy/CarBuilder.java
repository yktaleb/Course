package by.training.javapro.creational.builder.easy;

public class CarBuilder {
    private String make;
    private Transmission transmission;
    private int maxSpeed;

    CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}
