package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        List<Integer> list = new LinkedList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        inputStream.close();
        System.out.println(Collections.min(list));
    }
}
