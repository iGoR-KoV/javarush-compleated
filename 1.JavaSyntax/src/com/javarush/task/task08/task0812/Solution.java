package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      List<Integer> list = new ArrayList<>();
      int count = 1;
      int count2 = 1;

      for (int i = 0; i < 10; i++) {
          list.add(Integer.parseInt(reader.readLine()));
      }

        for (int i = 0; i < list.size() - 1; i++) {
           if(list.get(i).equals(list.get(i+1))) {
                count++;
                if (count2 < count) {
                    count2 = count;
                }
            } else {
               count = 1;
           }
        }

        System.out.println(count2);

    }
}