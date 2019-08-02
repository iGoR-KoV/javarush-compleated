package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a >= b && a >= c && a > d)
            System.out.println(a);
        else if (b >= a && b >= c && b > d)
            System.out.println(b);
        else if (c >= b && c >= a && c > d)
            System.out.println(c);
        else if (d >= b && d >= a && d >= c)
            System.out.println(d);
    }
}
