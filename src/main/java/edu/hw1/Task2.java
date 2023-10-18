package edu.hw1;

public final class Task2 {
    private Task2() {
    }

    static final int DEVISION = 10;

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int temp = number;
        int count = 0;
        while (Math.abs(temp) > 0) {
            temp /= DEVISION;
            count++;
        }
        return count;
    }
}
