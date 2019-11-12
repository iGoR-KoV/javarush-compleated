package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String line = reader.readLine();
       String subString = line.substring(line.indexOf('?') + 1);
       String [] lines = subString.split("&");
        for (String s : lines){
            String tmp = s.replaceAll("=.+$","");
            System.out.print(tmp + " ");
        }
            if (subString.contains("obj")) {
               try{
                   alert(Double.parseDouble(subString.substring(subString.indexOf("=") + 1, subString.indexOf("&"))));
               } catch (NumberFormatException e) {
                   alert((subString.substring(subString.indexOf("=") + 1, subString.indexOf("&"))));
               }
            }
        }
    public static void alert(double value) {
        System.out.println("double: " + value);
    }
    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
