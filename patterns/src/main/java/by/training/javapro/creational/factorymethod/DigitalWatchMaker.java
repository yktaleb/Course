package by.training.javapro.creational.factorymethod;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
