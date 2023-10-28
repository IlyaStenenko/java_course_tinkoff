package edu.hw3;

import java.util.HashMap;
import java.util.List;

public final class Task3 {

    private Task3() {}

    public static String frequencyDictionary(List<Object> input) {
        HashMap<? super Object, Integer> result = new HashMap<>();
        for (int i = 0; i < input.size(); i++) {
            if (!result.containsKey(input.get(i))) {
                result.put(input.get(i), 1);
            } else {
                result.put(input.get(i), (result.get(input.get(i))) + 1);
            }
        }
        return result.toString();
    }
}
