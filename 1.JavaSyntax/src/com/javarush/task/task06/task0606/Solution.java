package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int num = s.length();

        for (int i = 0; i < num ; i++) {
            char n = s.charAt(i);
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("Even: " + even + " " + "Odd: " + odd);
    }


}
