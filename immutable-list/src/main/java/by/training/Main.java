package by.training;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(frequencyMentioning(Arrays.asList(4, 5, 6, 4, 5, 3, 4, 2, 4, 5, 7)));

        List<Integer> immutableList = new ImmutableList<>();
        immutableList.add(4);
        immutableList.add(4);

        try {
            immutableList.remove(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(immutableList);
    }

    private static Map<Integer, Integer> frequencyMentioning(List<Integer> array) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < array.size(); i++) {
            Integer value = array.get(i);
            if (result.containsKey(value)) {
                result.put(value, result.get(value) + 1);
            } else {
                result.put(value, 1);
            }
        }
        return result;
    }
}
