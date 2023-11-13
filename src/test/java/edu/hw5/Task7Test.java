package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task7Test {

    @Test
    public void testFirstRegex() {
        Task7 task = new Task7();

        String string1 = "01011";
        assertTrue(task.firstRegex(string1));

        String string2 = "001000";
        assertFalse(task.firstRegex(string2));

        String string3 = "00";
        assertFalse(task.firstRegex(string3));
    }

    @Test
    public void testSecondRegex() {
        Task7 task = new Task7();

        String string1 = "1010101";
        assertTrue(task.secondRegex(string1));

        String string2 = "101010110";
        assertFalse(task.secondRegex(string2));
    }

    @Test
    public void testThirdRegex() {
        Task7 task = new Task7();

        String string1 = "111";
        assertTrue(task.thirdRegex(string1));

        String string2 = "10001";
        assertFalse(task.thirdRegex(string2));
    }
}