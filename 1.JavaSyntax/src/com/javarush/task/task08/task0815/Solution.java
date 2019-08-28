package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Максимов", "Евгений");
        map.put("Тихонов", "Андрей");
        map.put("Ермоленко", "Владислва");
        map.put("Коваль", "Антонина");
        map.put("Федоренко", "Анна");
        map.put("Тыщенников", "Евгений");
        map.put("Орлова", "Анна");
        map.put("Петрова", "Екатерина");
        map.put("Максимович", "Андрей");
        map.put("Тыщенко", "Петр");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {


       int counterValue = 0;

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry<String, String> pair = iter.next();
                    String value = pair.getValue();
               if (value.equals(name)) {
                   counterValue++;
                    }
            }




        return counterValue;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        int counterKey = 0;

        while (iter.hasNext()) {
            Map.Entry<String, String> pair = iter.next();
                    String key = pair.getKey();
            if (key.equals(lastName)) {
                counterKey++;
            }
        }

        return counterKey;
    }

    public static void main(String[] args) {

    }
}
