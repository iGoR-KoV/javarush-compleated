package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> sList = new ArrayList<>();
       String s;

        for (int i = 0; i < 5; i++) {
          s = reader.readLine();
            sList.add(s);
        }
        for (int i = 0; i < 13; i++) {
            String sEnd = sList.remove(4);
            sList.add(0, sEnd);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(sList.get(i));
        }
    }
}
