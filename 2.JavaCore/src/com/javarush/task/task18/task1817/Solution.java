package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
         long symbols = 0;
         long spaces = 0;

         while (inputStream.available() > 0) {
             int data = inputStream.read();
                 symbols++;
                 if (data == (int) ' ') {
                     spaces++;
                 }
             }

        inputStream.close();

        double result = (double)spaces / symbols * 100;
        System.out.printf("%.2f", result);
    }
}
