package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sList.add(reader.readLine());
        }

        int num = sList.get(4).length();

        for (int i = 0; i < 5; i++) {
            if (sList.get(i).length() < num) {
                num = sList.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (sList.get(i).length() == num) System.out.println(sList.get(i));
        }
    }
}
