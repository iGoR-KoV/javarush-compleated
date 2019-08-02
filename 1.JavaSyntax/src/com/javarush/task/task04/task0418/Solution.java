package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       if (a < b)
           System.out.println(a);
       if (b < a)
           System.out.println(b);
       if (a == b)
           System.out.println(a);
    }
}