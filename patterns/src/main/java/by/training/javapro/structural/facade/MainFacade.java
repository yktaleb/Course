package by.training.javapro.structural.facade;

public class MainFacade {
    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//        DVDRom dvdRom = new DVDRom();
//        dvdRom.loadData();
//        HDD hdd = new HDD();
//        hdd.copyFromDVDRom(dvdRom);

        new Computer().copy();
    }
}
