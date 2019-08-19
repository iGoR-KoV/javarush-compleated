package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       ArrayList<Integer> numList = new ArrayList<>();
       ArrayList<Integer> a = new ArrayList<>();
       ArrayList<Integer> b = new ArrayList<>();
       ArrayList<Integer> c = new ArrayList<>();



        for (int i = 0; i < 20; i++) {
            numList.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < numList.size(); i++) {

            Integer x = numList.get(i);
            if (x % 3 == 0 && x % 2 == 0) {
                    a.add(x);
                    b.add(x);
                } else if (x % 3 == 0) {
                    a.add(x);
                } else if (x % 2 == 0) {
                    b.add(x);
                } else {
                    c.add(x);
                }
            }
            printList(a);
            printList(b);
            printList(c);
        }


    public static void printList(ArrayList<Integer> list) {

        for (Integer x : list)
        {
            System.out.println(x);
        }

    }
}
