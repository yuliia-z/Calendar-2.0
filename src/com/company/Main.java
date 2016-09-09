package com.company;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar calendar;
        calendar = new Calendar();

        calendar.setDate(LocalDate.now());
        Printer.printCalendar(calendar);

        calendar.setDate(LocalDate.of(2016, 10, 10));
        Printer.printCalendar(calendar);

    }
}