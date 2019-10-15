package com.javarush.task.task13.task1318;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream stream = new FileInputStream(reader.readLine());
        reader.close();

        while (stream.available() > 0){
            System.out.print((char) stream.read());
        }
        stream.close();
    }
}