package com.company;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class zad2 {
    Calendar calSystem = Calendar.getInstance();

    int year = calSystem.get(Calendar.YEAR);
    int month = calSystem.get(Calendar.MONTH);
    int day = calSystem.get(Calendar.DAY_OF_MONTH);
    int hour = calSystem.get(Calendar.HOUR_OF_DAY);
    int minute = calSystem.get(Calendar.MINUTE);
    int second = calSystem.get(Calendar.SECOND);

    Calendar calUser = Calendar.getInstance();

    int Uyear, Umonth, Uday, Uhour, Uminute, Usecond;

    public zad2(int Uyear, int Umonth, int Uday){
        calUser.set(Calendar.YEAR, Uyear);
        calUser.set(Calendar.MONTH, Umonth-1);
        calUser.set(Calendar.DAY_OF_MONTH, Uday);

        this.Uyear = calUser.get(Calendar.YEAR);
        this.Umonth = calUser.get(Calendar.MONTH);
        this.Uday = calUser.get(Calendar.DAY_OF_MONTH);
        Uhour = calUser.get(Calendar.HOUR_OF_DAY);
        Uminute = calUser.get(Calendar.MINUTE);
        Usecond = calUser.get(Calendar.SECOND);
    }

    public void printCal(){
        System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n", year, month+1, day, hour, minute, second);

        System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n", Uyear, Umonth+1, Uday, Uhour, Uminute, Usecond);
    }

    public boolean compare(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        return (sdf.format(calSystem.getTime()).equals(sdf.format(calUser.getTime())));
    }
}
