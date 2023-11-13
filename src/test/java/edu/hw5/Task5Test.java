package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test {

    @Test
    public void testValidationRussianLicensePlate() {
        Task5 task = new Task5();

        String string1 = "А111АА111";
        assertTrue(task.validateRussianLicensePlate(string1));

        String string2 = "000аА111";
        assertFalse(task.validateRussianLicensePlate(string2));
    }
}