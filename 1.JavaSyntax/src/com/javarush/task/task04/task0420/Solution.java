package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

import static sun.swing.MenuItemLayoutHelper.max;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        MinMax minMax = new MinMax();
        int max = minMax.max(a, b, c);
        int min = minMax.min(a, b, c);

        int mid = (a+b+c) - (min + max);
        System.out.println(max + " " + mid + " " + min);
    }

    public static class MinMax {
        int min(int a, int b, int c) {
        if (a <= b && a <= c)
            return (a);
        if (b <= a && b <= c)
            return (b);
        else
            return (c);
    }

    int max(int a, int b, int c) {
        if (a >= b && a >= c)
            return(a);
        if (b >= a && b >= c)
            return (b);
        else
            return (c);
    }
}
}
