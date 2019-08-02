package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Name1 = reader.readLine();
        String Name2 = reader.readLine();

        int name1 = Name1.length();
        int name2 = Name2.length();

        if (Name1.equals(Name2))
            System.out.println("Имена идентичны");
        else if (name1 == name2)
            System.out.println("Длины имен равны");
    }
}
