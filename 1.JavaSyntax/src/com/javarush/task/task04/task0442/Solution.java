package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true) {
            int num = Integer.parseInt(reader.readLine());
            sum += num;
            if (num == -1)
                break;
        }
        System.out.println(sum);
        }
    }

