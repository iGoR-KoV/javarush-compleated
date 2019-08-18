package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int num = strings.get(0).length();

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() >= num) {
                num = strings.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == num) System.out.println(strings.get(i));
        }
    }
}
