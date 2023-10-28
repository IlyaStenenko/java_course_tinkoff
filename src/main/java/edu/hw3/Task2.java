package edu.hw3;

import java.util.ArrayList;

public final class Task2 {

    private Task2() {}

    public static String clusterize(String input) {
        if (input == null) {
            return "";
        }
        ArrayList<String> result = new ArrayList<>();
        StringBuilder currentString = new StringBuilder();
        int left = 0;
        int right = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                left++;
            } else if (input.charAt(i) == ')') {
                right++;
            } else {
                throw new IllegalArgumentException("Illegal symbol :" + input.charAt(i));
            }
            currentString.append(input.charAt(i));
            if (left == right && left != 0) {
                result.add(currentString.toString());
                left = 0;
                right = 0;
                currentString.delete(0, currentString.length());
            }
        }
        return result.toString();
    }
}
