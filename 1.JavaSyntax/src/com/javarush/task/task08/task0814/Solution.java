package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            Iterator<Integer> iter = set.iterator();

            while (iter.hasNext()) {
                Integer setElement = iter.next();
                if (setElement > 10) {
                    iter.remove();
                }
            }
        }
//            set.removeIf(setElement -> setElement > 10);
        return set;

    }

    public static void main(String[] args) {

    }
}
