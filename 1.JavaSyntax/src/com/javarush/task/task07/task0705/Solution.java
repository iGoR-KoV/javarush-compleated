package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] intArr = new int[20];
        int [] intArrSmall1 = new int[10];
        int [] intArrSmall2 = new int[10];


        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < intArrSmall1.length; i++) {
            intArrSmall1 [i] = intArr[i];
        }

        System.arraycopy(intArr, 10, intArrSmall2, 0, 10);

        for (int i = 0; i < intArrSmall2.length; i++) {
            System.out.println(intArrSmall2[i]);
        }
    }
}
