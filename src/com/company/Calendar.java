package com.company;

import java.time.LocalDate;

public class Calendar {
    private LocalDate date;
    private int[] month = new int[32];

    public Calendar() {
        this.date = LocalDate.now();
        createMonth();
    }

    public Calendar(LocalDate date) {
        this.date = date;
        createMonth();
    }

    private void createMonth() {
        int day = 1;
        for (int i = 0; i < date.lengthOfMonth(); i++) {
            month[i] = day;
            day++;
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public int[] getMonth() {
        return month;
    }
}
