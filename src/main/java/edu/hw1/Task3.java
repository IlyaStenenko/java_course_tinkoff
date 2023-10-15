package edu.hw1;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Task3 {
    private Task3() {}

    private static final Logger LOGGER = LogManager.getLogger();

    public static boolean isNestable(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            LOGGER.info("Array is NULL");
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (array1.length == 0 || array2.length == 0) {
            return false;
        } else {
            return (array1[0] > array2[0] && array1[array1.length - 1] < array2[array2.length - 1]);
        }
    }
}
