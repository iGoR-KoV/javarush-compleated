package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while(true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);
            }
            catch(Exception ex) {
                break;
            }
        }

        for(Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s.getValue() + " " + s.getKey());
        }
    }
}
