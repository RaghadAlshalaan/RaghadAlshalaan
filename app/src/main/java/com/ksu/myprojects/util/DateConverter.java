package com.ksu.myprojects.util;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    static DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date fromTimestamp(String value) {
        if (value != null) {
            try {
                return df.parse(value);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        } else {
            return null;
        }
    }

    public static String dateToTimestamp(Date value) {
        return value == null ? null : df.format(value);
    }
}