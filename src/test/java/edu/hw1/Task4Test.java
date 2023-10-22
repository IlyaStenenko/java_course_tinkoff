package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    static String[] answer = {"214365","This is a mixed up string."};
    static int i = 0;
    @ParameterizedTest
    @ValueSource(strings = {"123456","hTsii  s aimex dpus rtni.g"})
    void withEvenLengthTest(String input) {
        StringBuilder result = Task4.fixString(input);
        assertEquals(answer[i], result.toString());
        i++;
    }

    @Test
    void withOddLengthTest() {
        String input = "badce";

        StringBuilder result = Task4.fixString(input);

        assertEquals("abcde", result.toString());
    }

    @Test
    void withSingleSymbolTest() {
        String input = "a";

        StringBuilder result = Task4.fixString(input);

        assertEquals("a", result.toString());
    }

    @Test
    void emptyStringTest() {
        String input = "";

        StringBuilder result = Task4.fixString(input);

        assertEquals("", result.toString());
    }
}
