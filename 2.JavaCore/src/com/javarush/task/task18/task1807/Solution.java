package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        reader.close();

        int code = (byte)(',');
        int count = 0;

        while (stream.available() > 0) {
            if(stream.read()==code) {
                count++;
            }
        }
        stream.close();

        System.out.println(count);
    }
}
