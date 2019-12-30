package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        TreeSet<Integer> set = new TreeSet<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            set.add(data);
        }

        inputStream.close();

        for (int value : set)
            System.out.print(value + " ");
    }
}
