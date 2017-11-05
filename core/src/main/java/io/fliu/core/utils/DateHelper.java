package io.fliu.core.utils;

import java.text.SimpleDateFormat;

/**
 * Created by liulingfeng on 2017/11/5.
 */

public class DateHelper {
    public static long getMonthBegin(int year, int month){
        return 0;
    }

    public static long getMonthEnd(int year, int month) {
        return 0;
    }

    public static int getWeekDay(long date) {
        return 0;
    }

    public static int getDayBegin(int year, int month, int day) {
        return 0;
    }

    public static int getDayEnd(int year, int month, int day) {
        return 0;
    }

    public static int[] getDateValue(long date, String d){

        int[] dateValue = new int[7];
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy" + d + "MM" + d + "dd" + d + "HH" + d + "mm" + d + "SS" + d + "sss");

        int cnt = 0;
        for (String s : dateFormat.format(date).split(d)){
            dateValue[cnt++] = Integer.valueOf(s);
        }

        return dateValue;
    }
}
