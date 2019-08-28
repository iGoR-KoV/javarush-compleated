package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.JULY;
import static java.util.Calendar.JUNE;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Тихонов", dateFormat.parse("DECEMBER 12 2012"));
        map.put("Ермоленко", dateFormat.parse("JUNE 6 2012"));
        map.put("Коваль", dateFormat.parse("MARCH 19 2012"));
        map.put("Федоренко", dateFormat.parse("AUGUST 05 2012"));
        map.put("Тимофеев", dateFormat.parse("NOVEMBER 13 2012"));
        map.put("Орлова", dateFormat.parse("JANUARY 17 2012"));
        map.put("Петрова", dateFormat.parse("JULY 1 2012"));
        map.put("Максимович", dateFormat.parse("MAY 11 2012"));
        map.put("Тыщенко", dateFormat.parse("APRIL 1 2012"));

        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();

            String date = pair.getValue().toString();

            if (date.contains("Jun") || date.contains("Jul") || date.contains("Aug")) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {
//        createMap().entrySet().forEach(entry->{
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });
    }
}
