package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] number = new int [3];
        int positive = 0, negative = 0, zero = 0;
        for ( int i = 0; i < 3; i++) {
            number[i] = Integer.parseInt(reader.readLine());
            if (number[i] < 0) {
                negative++;
            }
            if (number[i] > 0) {
                positive++;
            }
            if (number[i] == 0) {
                zero++;
            }
            System.out.println("количество отрицательных чисел: " + negative + "\n" + "количество положительных чисел: " + positive);

            }

        }

    }

