package by.training.javapro.creational.builder.difficult;

public class MainDifficultBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new LexusBuilder());
        Car car = director.buildCar();
    }
}
