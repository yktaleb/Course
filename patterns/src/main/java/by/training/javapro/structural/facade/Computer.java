package by.training.javapro.structural.facade;

public class Computer {
    private Power power;
    private DVDRom dvdRom;
    private HDD hdd;

    public Computer() {
        power = new Power();
        dvdRom = new DVDRom();
        hdd = new HDD();
    }

    public void copy() {
        power.on();
        dvdRom.loadData();
        hdd.copyFromDVDRom(dvdRom);
    }
}
