package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

import java.util.Collections;

public class StringHelper {
    public static String multiply(String s) {
        String result = "Амиго";
        result = String.join("", Collections.nCopies(5, s));

        return result;
    }

    public static String multiply(String s, int count) {
        String result = "Амиго";
        result = String.join("", Collections.nCopies(count, s));
        return result;
    }

    public static void main(String[] args) {

    }
}
