package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String [] stringArr = new String[10];
       int [] intArr = new int[10];

        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = reader.readLine();
            intArr[i] = stringArr[i].length();
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
