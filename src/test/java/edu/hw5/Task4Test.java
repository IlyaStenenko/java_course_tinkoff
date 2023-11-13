package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4Test {

    @Test
    public void testValidationPassword() {
        Task4 task = new Task4();

        String password1 = "abc!123";
        assertTrue(task.checkValidationPassword(password1));

        String password2 = "abc123";
        assertFalse(task.checkValidationPassword(password2));
    }
}