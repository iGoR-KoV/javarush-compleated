package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("String 1");
        s.add("String 2");
        s.add("String 3");
        s.add("String 4");
        s.add("String 5");

        System.out.println(s.size());

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
}
