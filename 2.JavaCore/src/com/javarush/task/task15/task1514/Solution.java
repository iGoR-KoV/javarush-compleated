package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(567848099d, "Mark");
        labels.put(9796d, "Tom");
        labels.put(8787834787d, "Jenny");
        labels.put(33453545d, "John");
        labels.put(335345465d, "Merry");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
