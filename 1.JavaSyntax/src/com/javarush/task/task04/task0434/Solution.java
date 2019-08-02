package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            int s = 1;
            while (s <= 10) {
                System.out.print(s*n + " ");
                s++;
            }
            System.out.println();
            n++;
        }

    }
}
