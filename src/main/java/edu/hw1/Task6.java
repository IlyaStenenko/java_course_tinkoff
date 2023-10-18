package edu.hw1;

import java.util.Arrays;

public final class Task6 {
    private Task6() {}

    static final int MAXINT = 9999;
    static final int MININT = 1000;
    static final int KAPREKAL_NUMBER = 6174;

    public static int countK(int number) {
        if (number < MININT || number > MAXINT) {
            return 0;
        }
        if (number == KAPREKAL_NUMBER) {
            return 0;
        }
        return 1 + countK(descendingMinusAscendingNumbers(number));
    }

    private static int descendingMinusAscendingNumbers(int number) {
        StringBuilder result = new StringBuilder();
        String numberStr = Integer.toString(number);
        char[] charArray = numberStr.toCharArray();
        Arrays.sort(charArray);
        for (var num : charArray) {
            result.append(num);
        }
        return Integer.parseInt(String.valueOf(result.reverse())) - Integer.parseInt(String.valueOf(result.reverse()));
    }
}
