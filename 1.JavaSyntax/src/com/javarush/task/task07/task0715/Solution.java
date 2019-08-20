package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        String x = "именно";

        for (int i = 0; i < list.size() + 1; i++) {
            if (i % 2 != 0) {
                list.add(i, x);
            }
        }

        for(String s : list) {
            System.out.println(s);
        }

    }
}
