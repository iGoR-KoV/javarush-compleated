package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String str = reader.readLine();
       if (str.equals("helicopter")) {
           result = new Helicopter();
           System.out.println(result);
       } else if (str.equals("plane")){
           int passengers = Integer.parseInt(reader.readLine());
           result = new Plane(passengers);
           System.out.println(result);
       }
        reader.close();
    }
}
