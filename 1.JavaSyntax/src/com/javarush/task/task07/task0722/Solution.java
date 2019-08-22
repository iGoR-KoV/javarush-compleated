package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

//        do{
//           list.add(reader.readLine());
//       } while (!(list.contains("end")));

        for (int i = list.size(); i >=0 ; i++) {
            list.add(reader.readLine());
            if (list.contains("end")) {
                list.remove("end");
                break;
            }
        }
           list.forEach(System.out::println);

    }
}