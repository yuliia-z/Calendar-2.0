package com.company;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Printer {
    public static void printCalendar(Calendar calendar) {
        int positionOfFirstDayOfMonth = (calendar.getDate().getDayOfWeek().minus(calendar.getDate().getDayOfMonth())).getValue();
        printNamesOfTheDays();
        printTabsForFirstDay(positionOfFirstDayOfMonth);
        printDates(calendar, positionOfFirstDayOfMonth);

        System.out.println();
    }

    private static void printNamesOfTheDays() {
        for (int i = 1; i <= 7; i++) {
            System.out.print(DayOfWeek.of(i).getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + " ");
        }
        System.out.println();
    }

    private static void printTabsForFirstDay(int positionOfFirstDayOfMonth) {
        if (positionOfFirstDayOfMonth == 7) {
            System.out.print("");
        } else {
            for (int j = 0; j < positionOfFirstDayOfMonth; j++) {
                System.out.print("\t");
            }
        }
    }

    private static void printDates(Calendar calendar, int positionOfFirstDayOfMonth) {
        for (int i = 0; i <= calendar.getMonth()[i]; i++) {
            System.out.print(ColorOfDays.colorDate(calendar.getMonth()[i], calendar.getDate()) + "\t");
            if (isLastDayOfWeek(calendar.getMonth()[i], positionOfFirstDayOfMonth)) {
                System.out.println();
            }
        }
    }

    private static boolean isLastDayOfWeek(int getDayOfMonth, int positionOfFirstDayOfMonth) {
        return ((getDayOfMonth + positionOfFirstDayOfMonth) % 7 == 0);
    }
}
