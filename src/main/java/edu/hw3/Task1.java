package edu.hw3;

public final class Task1 {

    private Task1() {}

    //A = 65
    //a = 97
    static final char LOWALFABET = 97;
    static final char UPPERALFABET = 65;
    static final int POWERALFABET = 26;

    public static String shifrAtbash(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current >= LOWALFABET && current < LOWALFABET + POWERALFABET) {
                result.append((char) (LOWALFABET + POWERALFABET - 1 - (current - LOWALFABET)));
            } else if (current >= UPPERALFABET && current < UPPERALFABET + POWERALFABET) {
                result.append((char) (UPPERALFABET + POWERALFABET - 1 - (current - UPPERALFABET)));
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }
}

