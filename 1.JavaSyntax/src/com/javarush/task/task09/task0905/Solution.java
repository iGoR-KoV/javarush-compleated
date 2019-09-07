package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();

    }

    public static int getStackTraceDeep() {
        int stackDeep = Thread.currentThread().getStackTrace().length;
        System.out.println(stackDeep);
        return stackDeep;
    }
}

