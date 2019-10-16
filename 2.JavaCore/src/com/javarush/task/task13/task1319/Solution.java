package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

            while (true) {
                String data = reader.readLine();
                if (data.equals("exit")) {
                    writer.write(data + "\r\n");
                    break;
                }
                writer.write(data + "\r\n");
            }

            writer.close();

//        try {
//            File file = new File("file.txt");
//            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader
//
//            FileWriter fileReader = new FileWriter(file); // поток который подключается к текстовому файлу
//            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWriter
//
//            String line;
//            while(!(line = bufferedReader.readLine()).equals("exit")) {
//                bufferedWriter.write(line + System.lineSeparator() + "exit");
//            }
//
//            bufferedReader.close(); // закрываем поток
//            bufferedWriter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
