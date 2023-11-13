package edu.hw5;

public final class Task5 {


    public boolean validateRussianLicensePlate(String licensePlate) {
        String regex = "[АВЕГОавего]{1}\\d{3}[АВЕГОавего]{2}\\d{3}";
        return licensePlate.matches(regex);
    }
}
