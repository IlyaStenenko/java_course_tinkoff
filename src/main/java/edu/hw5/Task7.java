package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task7 {

    public boolean firstRegex(String inputString) {
        Pattern pattern = Pattern.compile("^[01]{2}0[0|1]*$");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.find();
    }

    public boolean secondRegex(String inputString) {
        Pattern pattern = Pattern.compile("^(0|1).*(\\1)$");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.find();
    }

    public boolean thirdRegex(String inputString) {
        Pattern pattern = Pattern.compile("^[01]{1,3}$");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.find();
    }
}
