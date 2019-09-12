package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        ArrayList<Integer> input = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                input.add(Integer.parseInt(reader.readLine()));
            }

        }
        catch (IOException e) {

        }
        finally {
            for(int x : input) {
                System.out.println(x);
            }
        }
    }
}
