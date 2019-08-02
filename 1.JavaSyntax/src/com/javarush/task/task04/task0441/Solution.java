package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


            if (true) {
            int max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            int min = a;
            if (min > b) min = b;
            if (min > c) min = c;
            System.out.println((a + b + c) - (max + min));
            }

        else if ((a == b && a != c) || (a == c && a != b) || (a == b && b == c))
            System.out.println(a);
        else if (b == c && b != a)
            System.out.println(b);
    }
}
