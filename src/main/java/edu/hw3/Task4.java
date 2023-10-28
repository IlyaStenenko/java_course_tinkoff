package edu.hw3;

import java.util.LinkedHashMap;

@SuppressWarnings("checkstyle:MagicNumber")
public final class Task4 {

    private Task4() {}

    static LinkedHashMap<Integer, String> romanNumbers = new LinkedHashMap<>();

    static {
        romanNumbers.put(1000, "M");
        romanNumbers.put(900, "CM");
        romanNumbers.put(500, "D");
        romanNumbers.put(400, "CD");
        romanNumbers.put(100, "C");
        romanNumbers.put(90, "XC");
        romanNumbers.put(50, "L");
        romanNumbers.put(40, "XL");
        romanNumbers.put(10, "X");
        romanNumbers.put(9, "IX");
        romanNumbers.put(5, "V");
        romanNumbers.put(4, "IV");
        romanNumbers.put(1, "I");
    }


    public static String convertToRoman(Integer number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Your number dont convert!");
        }
        StringBuilder result = new StringBuilder();
        int numberCopy = number;
        for (int arabNumber: romanNumbers.keySet()) {
            while (numberCopy >= arabNumber) {
                result.append(romanNumbers.get(arabNumber));
                numberCopy -= arabNumber;
            }
        }
        return result.toString();
    }
}
