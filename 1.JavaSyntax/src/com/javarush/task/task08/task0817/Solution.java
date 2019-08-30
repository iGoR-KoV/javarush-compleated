package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Максимов", "Евгений");
        map.put("Тихонов", "Андрей");
        map.put("Ермоленко", "Владислва");
        map.put("Ковальчук", "Антонина");
        map.put("Федоренко", "Анна");
        map.put("Тимощук", "Евгений");
        map.put("Орлова", "Анна");
        map.put("Петрова", "Екатерина");
        map.put("Максимович", "Андрей");
        map.put("Тыщенко", "Петр");

        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        HashMap<String, Integer> count = new HashMap<>();
        for(Map.Entry<String, String> pair: map.entrySet()) {
            count.put(pair.getValue(), count.getOrDefault(pair.getValue(), 0) + 1);
        }
        for(Map.Entry<String, Integer> pair : count.entrySet()) {
            if (pair.getValue() > 1) {
                removeItemFromMapByValue(map, pair.getKey());
            }
        }
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {


//                createMap().entrySet().forEach(entry->{
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });

    }
}
