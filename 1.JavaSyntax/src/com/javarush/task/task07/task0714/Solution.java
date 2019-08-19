package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sList = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String x = scanner.nextLine();
            sList.add(x);
        }
        sList.remove(2);

        Collections.reverse(sList);

        for (String x : sList) {
            System.out.println(x);
        }
    }
}
