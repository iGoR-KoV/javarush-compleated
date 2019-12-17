package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем объект FileInputStream, привязанный к файлу «text.txt».
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        List<Integer> list = new LinkedList<>();

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            list.add(data); // добавляем в список
        }
        inputStream.close(); // закрываем поток

        System.out.println(Collections.max(list)); //выводим максимум на экран.
    }
}
