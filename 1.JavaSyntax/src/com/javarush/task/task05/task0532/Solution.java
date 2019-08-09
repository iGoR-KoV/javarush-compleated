package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(reader.readLine());
                if (num > maximum) {
                    maximum = num;
                }
            }
        }

        System.out.println(maximum);
    }
}


