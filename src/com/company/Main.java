package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        zad2 a = new zad2(2021,11,16);
        a.printCal();
        System.out.println("\n"+a.compare()+"\n");

        zad4 b = new zad4();
        Calendar cal = b.calendar(2021,11,12, 20,8);
        Date date = b.dataCreate("2021 11 12 20:08");
        b.readData(date);
        b.readCalendar(cal);

    }
}
