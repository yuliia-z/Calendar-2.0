package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ColorOfDays {
    private static String colorForCurrentDay = "\033[36m";
    private static String colorForWeekend = "\033[31m";
    private static String colorForWorkDays = "\033[37m";

    public static String colorDate(int numberOfDay, LocalDate date) {
        DayOfWeek dayOfWeek = DayOfWeek.from(date.withDayOfMonth(numberOfDay));
        if (isCurrentDay(numberOfDay, date)) {
            return colorForCurrentDay + numberOfDay;
        } else if (isWeekend(dayOfWeek)) {
            return colorForWeekend + numberOfDay;
        } else {
            return colorForWorkDays + numberOfDay;
        }
    }

    public static boolean isCurrentDay(int numberOfDay, LocalDate date) {
        return date.getDayOfMonth() == numberOfDay;
    }

    private static boolean isWeekend(DayOfWeek getDayOfMonth) {
        return (getDayOfMonth == DayOfWeek.SATURDAY || getDayOfMonth == DayOfWeek.SUNDAY);
    }

}

