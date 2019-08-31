package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Максимов", "Евгений");
        map.put("Тихонов", "Андрей");
        map.put("Ермоленко", "Владислва");
        map.put("Коваленко", "Антонина");
        map.put("Федоренко", "Анна");
        map.put("Ермоленко", "Евгений");
        map.put("Орлова", "Анна");
        map.put("Петрова", "Екатерина");
        map.put("Максимович", "Андрей");
        map.put("Тихонов", "Петр");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
