package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args){
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList<String>[] arrayLists = new ArrayList[3];
        Arrays.setAll(arrayLists, element -> new ArrayList<>());

        arrayLists[0].add("Mama");
        arrayLists[1].add("мыла");
        arrayLists[2].add("раму");

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}