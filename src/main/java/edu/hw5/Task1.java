package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public final class Task1 {

    final static int HOUR = 3600;
    final static int MINUTE = 60;

    public String averageTime(List<String> sessions) {
        long totalDurationSeconds = 0;
        int count = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");

        for (String session : sessions) {
            String[] times = session.split(" - ");
            LocalDateTime start = LocalDateTime.parse(times[0], formatter);
            LocalDateTime end = LocalDateTime.parse(times[1], formatter);
            Duration duration = Duration.between(start, end);
            totalDurationSeconds += duration.getSeconds();
            count++;
        }

        long averageDurationSeconds = totalDurationSeconds / count;
        long hours = averageDurationSeconds / HOUR;
        long minutes = (averageDurationSeconds % HOUR) / MINUTE;

        return hours + "ч " + minutes + "м";
    }
}
