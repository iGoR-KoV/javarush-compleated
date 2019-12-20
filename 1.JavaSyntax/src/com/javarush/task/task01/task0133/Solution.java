package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int time1 = 15*60*60;
        int time2 = (15*60*60)+(30*60);
        int secondsAfter15 = time2 - time1;
        System.out.println(secondsAfter15);
    }
}