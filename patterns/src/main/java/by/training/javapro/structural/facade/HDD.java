package by.training.javapro.structural.facade;

public class HDD {
    public void copyFromDVDRom(DVDRom dvdRom) {
        if (dvdRom.hasData()) {
            System.out.println("Копирование ...");
        } else {
            System.out.println("Вставте диск");
        }
    }
}
