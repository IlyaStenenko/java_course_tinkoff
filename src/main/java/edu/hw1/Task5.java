package edu.hw1;

public final class Task5 {
    private Task5() {}

    static final int DEVISION = 10;

    public static boolean isPalindromeDescendant(int number) {
        int temp = number;
        while (temp >= DEVISION) {
            if (isPalindrome(temp)) {
                return true;
            }
            int sum = 0;
            temp = reverseNumber(temp);
            while (temp > 0) {
                int num = temp % DEVISION + (temp / DEVISION) % DEVISION;
                if (num >= DEVISION) {
                    sum = (sum * DEVISION) * DEVISION + num;
                } else {
                    sum = sum * DEVISION + num;
                }
                temp /= (DEVISION * DEVISION);
            }
            temp = sum;
        }
        return false;
    }

    private static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }


    private static int reverseNumber(int number) {
        int temp = number;
        int reversedNumber = 0;
        while (temp > 0) {
            reversedNumber = reversedNumber * DEVISION + temp % DEVISION;
            temp = temp / DEVISION;
        }
        return reversedNumber;
    }
}
