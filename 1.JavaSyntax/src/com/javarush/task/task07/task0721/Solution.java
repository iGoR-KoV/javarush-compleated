package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[20];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int minimum = 0;
        int maximum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int anArray : array) {

            if (anArray > min) {
                min = anArray;
                maximum = min;
            }
            if (anArray < max) {
                max = anArray;
                minimum = max;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
