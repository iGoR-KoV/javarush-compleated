package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Boolean result = Integer.parseInt(new SimpleDateFormat("D").format(new Date(date))) % 2 == 0 ? false : true;
        return result;
//
//        Calendar calendar = new GregorianCalendar(2013, 0, 1);
//        Date date1 = calendar.getTime(); //Tue Jan 01 00:00:00 EET 2013
//         SimpleDateFormat output = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
//        Date date2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH).parse(date);
//
//
//        long msTimeDistance = date2.getTime() - date1.getTime();
//        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
//
//        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
//        System.out.println(dayCount);
//
//        if (dayCount % 2 == 0) {
//            return false;
//        } else {
//            return true;
//        }

    }
}
