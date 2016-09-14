package com.company;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar calendar;

        calendar = new Calendar();
        Printer.printCalendar(calendar);

        calendar = new Calendar(LocalDate.of(2016, 8, 10));
        Printer.printCalendar(calendar);
    }
}
