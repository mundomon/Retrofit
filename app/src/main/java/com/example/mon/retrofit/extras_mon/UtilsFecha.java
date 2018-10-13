package com.example.mon.retrofit.extras_mon;

import android.location.Location;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by mon on 3/9/18.
 */

public class UtilsFecha {

    public UtilsFecha() {
    }

    public static void ahora() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        long date = new Date().getTime();
        Log.d("KK", "Date.getTime : " + date);

        Calendar cal = Calendar.getInstance();
        long milis = cal.getTimeInMillis();
        Log.d("KK", "Cal.getTimeinMilis: " + milis);
        Log.d("KK", "Cal.getTime.dateformat: " + dateFormat.format(cal.getTime()));
        Log.d("KK", "Cal.getTime.dateformat: " + dateFormat.format(milis));




        Date date3 = new Date();
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Log.d("KK", "Date.setTimeZone.dateformat: " + dateFormat.format(date3));

        Log.d("KK", "System.currentTimeInMilis: " + System.currentTimeMillis());

    }

    public static long ahoraUTClong() {
        long date = new Date().getTime();
        Log.d("KK", "ahoraUTClong: " + date);
        return date;
    }

    public static long ahoraSystemlong() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        long milis = cal.getTimeInMillis();
        Log.d("KK", "ahoraSystemlong: " + milis);
        Log.d("KK", "ahoraSystemlong: " + cal);
        return milis;
    }

    public static String ahoraUTC() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Log.d("KK", "ahoraUTC: " + dateFormat.format(date));
        return dateFormat.format(date);

    }

    public static String ahoraCalendar() {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        //dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Log.d("KK", "ahoraCalendar: " + dateFormat.format(date.getTime()));
        return dateFormat.format(date.getTime());

    }

    public static String getUTCstring(Location location) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(location.getTime())); // Append the string "UTC" to the date
        if (!date.contains("UTC")) {
            date += " UTC";
        }
        Log.d("KK", "getUTCstring: " + date);
        return date;
    }
}
