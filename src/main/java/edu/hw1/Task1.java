package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Task1 {
    private Task1() {}

    static final int MAXSECONDS = 60;

    private static final Logger LOGGER = LogManager.getLogger();

    public static int minutesToSeconds(String time) {
        if (time == null) {
            LOGGER.info("Time is NULL!");
            return -1;
        }
        if (time.isEmpty()) {
            LOGGER.info("Time not empty!");
            return -1;
        }
        int firstValue = Integer.parseInt(time.substring(time.indexOf(":") + 1));
        int lastValue = Integer.parseInt(time.substring(0, time.indexOf(":")));
        if (firstValue >= MAXSECONDS || firstValue < 0 || lastValue < 0) {
            return -1;
        }
        return lastValue * MAXSECONDS + firstValue;
    }
}
