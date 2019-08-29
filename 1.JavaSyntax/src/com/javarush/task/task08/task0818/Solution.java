package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Максимов", 700);
        map.put("Тихонов", 400);
        map.put("Ермоленко", 1200);
        map.put("Ковальчук", 5000);
        map.put("Федоренко", 40);
        map.put("Тимощук", 800);
        map.put("Орлова", 1000);
        map.put("Петрова", 3000);
        map.put("Максимович", 400);
        map.put("Тыщенко", 750);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        map.entrySet().removeIf(pair -> pair.getValue() < 500);
    }


    public static void main(String[] args) {

    }
}