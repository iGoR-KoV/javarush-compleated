package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] smallerHalf = new byte[file1.available()/2];
        byte[] biggerHalf = new byte[file1.available() - smallerHalf.length];

        file1.read(biggerHalf);
        file2.write(biggerHalf);
        file2.close();

        file1.read(smallerHalf);
        file3.write(smallerHalf);
        file3.close();

        file1.close();
    }
}
