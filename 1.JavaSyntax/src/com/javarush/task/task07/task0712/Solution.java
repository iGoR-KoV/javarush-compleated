package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            sList.add(reader.readLine());
        }
        int numS = sList.get(9).length();

        for (int i = 0; i < 10; i++) {
            if (sList.get(i).length() < numS) {
                numS = sList.get(i).length();
            }
        }
        int numL = sList.get(0).length();

        for (int i = 0; i < 10; i++) {
            if (sList.get(i).length() >= numL) {
                numL = sList.get(i).length();
            }
        }
        for (int i = 0; i < 10; i++) {
            if (sList.get(i).length() == numS){
                System.out.println(sList.get(i));
                break;
        } else if (sList.get(i).length() == numL){
                System.out.println(sList.get(i));
                break;
            }
        }

    }
}
