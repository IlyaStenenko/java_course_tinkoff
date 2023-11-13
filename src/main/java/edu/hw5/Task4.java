package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task4 {

    public boolean checkValidationPassword(String inputString) {
        Pattern pattern = Pattern.compile("[~!@#$%^&*|]");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.find();
    }
}
