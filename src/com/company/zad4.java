package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class zad4 {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm");

    public Date dataCreate(String data){
        try {
            Date now = sdf.parse(data);
            return now;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void readData(Date now){
        System.out.println("Созданная дата: "+sdf.format(now));
    }

    public Calendar calendar(int Uyear, int Umonth, int Uday, int Uhours, int Uminute){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, Uyear);
        calendar.set(Calendar.MONTH, Umonth-1);
        calendar.set(Calendar.DAY_OF_MONTH, Uday);
        calendar.set(Calendar.HOUR_OF_DAY, Uhours);
        calendar.set(Calendar.MINUTE, Uminute);

        return calendar;
    }

    public void readCalendar(Calendar calendar){
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // 0 to 11
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        System.out.printf("Созданный календарь: %4d %02d %02d %02d:%02d\n",year, month+1, day, hour, minute);
    }
}
