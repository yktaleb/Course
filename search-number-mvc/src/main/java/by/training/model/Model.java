package by.training.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int[] array;

    public Model() {
    }

    public Model(int[] array) {
        this.array = array;
    }

    public Model(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*size);
        }
    }

    public List getIndexesByValue(int value) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result.add(i);
            }
        }
        return result;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
