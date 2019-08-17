package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = intArr.length -1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }
    }
}

