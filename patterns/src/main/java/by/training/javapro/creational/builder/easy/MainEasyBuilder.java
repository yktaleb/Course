package by.training.javapro.creational.builder.easy;

public class MainEasyBuilder {
    public static void main(String[] args) {
        Car bmw = new CarBuilder()
                .setMake("BMW")
                .setTransmission(Transmission.AUTO)
                .setMaxSpeed(280)
                .build();
    }
}
