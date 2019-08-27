package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();

        set = Stream.of("Любов", "Липа", "Ливень","Линолиум", "Лавра", "Лабрадор","Лабуда", "Лаваш", "Лаванда","Лавина", "Лагуна", "Лавка","Лада", "Лаборант", "Лампа","Латекс", "Лассо", "Ласково","Ласка", "Линять").collect(Collectors.toSet());

//        for (int i = 0; i < 20; i++)
//            add("Л"+i);

        return set;
    }

    public static void main(String[] args) {

    }
}
