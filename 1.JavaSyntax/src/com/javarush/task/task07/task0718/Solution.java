package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int min = 0;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > min) {
                min = list.get(i).length();

            } else {
                System.out.println(list.indexOf(list.get(i)));
                break;
            }
        }
    }
}

