package by.training.javapro.creational.factorymethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        WatchMaker watchMaker = getMakerByName("rome");

        Watch watch = watchMaker.createWatch();
        watch.showTime();
    }

    private static WatchMaker getMakerByName(String watchName) {
        if ("digital".equals(watchName)) {
            return new DigitalWatchMaker();
        } else if ("rome".equals(watchName)) {
            return new RomeWatchMaker();
        }

        throw new RuntimeException("This type is not supported");
    }
}
