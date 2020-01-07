package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(15,16.6));
    System.out.println(convertEurToUsd(25, 16.6));
    }

    public static double convertEurToUsd(int eur, double course) {
       return eur * course;
       //напишите тут ваш код
    }
}
