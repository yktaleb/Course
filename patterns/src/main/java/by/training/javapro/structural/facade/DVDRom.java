package by.training.javapro.structural.facade;

public class DVDRom {
    private boolean data = false;

    public void loadData() {
        data = true;
    }

    public void unloadData() {
        data = false;
    }

    public boolean hasData() {
        return data;
    }
}
