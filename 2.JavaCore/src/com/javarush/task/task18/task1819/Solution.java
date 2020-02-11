package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String output = reader.readLine();

        FileInputStream one = new FileInputStream(input);
        FileInputStream two = new FileInputStream(output);

        byte[] first = new byte[one.available()];
        one.read(first);
        one.close();

        byte[] second = new byte[two.available()];
        two.read(second);
        two.close();

        FileOutputStream three = new FileOutputStream(input);

        three.write(second);
        three.write(first);
        three.close();

        reader.close();
    }
}
