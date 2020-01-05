package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] array = new byte[file1.available()];
        for (int i = array.length-1; i >=0 ; i--) {
            file1.read(array);
            file2.write(array[i]);
        }
        file1.close();
        file2.close();
    }
}
