package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String s = reader.readLine();
        int num = Integer.parseInt(reader.readLine());

        int i = 0;

        while (i != num) {
            i++;
            System.out.println(s);
        }


    }
}
