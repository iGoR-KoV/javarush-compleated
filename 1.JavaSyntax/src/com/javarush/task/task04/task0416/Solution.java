package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());
        time = time % 5;
        if (time < 3) {
            System.out.println("зелёный");
        }
        if (time >= 3 && time < 4) {
            System.out.println("жёлтый");
        }
        if (time >= 4 && time < 5) {
            System.out.println("красный");
        }

    }
}