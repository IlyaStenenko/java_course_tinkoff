package edu.hw5;

public final class Task6 {

    public boolean isSubsequence(String s, String t) {
        String regex = ".*" + String.join(".*", t.split("")) + ".*";
        return s.matches(regex);
    }
}
