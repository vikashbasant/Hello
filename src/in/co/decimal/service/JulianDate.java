package in.co.decimal.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JulianDate {
    public static final int DAYS_OF_MONTHS[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args){
        String julianDate = getJulianDate ();
        System.out.println ("julianDate = " + julianDate);
    }

    public static String getJulianDate(){
        Date currentDate = new Date();
        SimpleDateFormat date_format = new SimpleDateFormat ("YYYY-dd-MM");
        String date = date_format.format (currentDate);
        System.out.println (date);

        String day = date.substring (5, 7);
        System.out.println (day);
        String month = date.substring(8, 10);
        System.out.println (month);
        String year = date.substring(0, 4);
        System.out.println (year);
        int years = Integer.parseInt (year);

        int daySum = 0;
        if(years %400 == 0 || years%4 == 0){
            int days = Integer.parseInt (day);
            int months = Integer.parseInt (month);

            for(int i=0; i<months-1; i++){
                daySum += DAYS_OF_MONTHS[i];
            }

            daySum += days;
        }else{
            int days = Integer.parseInt (day);
            int months = Integer.parseInt (month);

            for(int i=0; i<months-1; i++){
                daySum += DAYS_OF_MONTHS[i];
            }

            daySum += days;
        }

        return String.valueOf (daySum);
    }
}
