package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char [] c = string.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (i > 0 && c[i-1] == ' ' || i == 0) {
                c[i]=Character.toUpperCase(c[i]);
            }
        }
        System.out.println(c);


    }
}
