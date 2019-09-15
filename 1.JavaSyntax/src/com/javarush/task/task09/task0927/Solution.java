package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Barsic1", new Cat("Barsic1"));
        catMap.put("Barsic2", new Cat("Barsic2"));
        catMap.put("Barsic3", new Cat("Barsic3"));
        catMap.put("Barsic4", new Cat("Barsic4"));
        catMap.put("Barsic5", new Cat("Barsic5"));
        catMap.put("Barsic6", new Cat("Barsic6"));
        catMap.put("Barsic7", new Cat("Barsic7"));
        catMap.put("Barsic8", new Cat("Barsic8"));
        catMap.put("Barsic9", new Cat("Barsic9"));
        catMap.put("Barsic10", new Cat("Barsic10"));

       return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
