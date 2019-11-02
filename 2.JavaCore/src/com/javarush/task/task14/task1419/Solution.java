package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        FilenotFound();
        ArrayIndexOutOfBoundException();
        ArrayStoreException();
        ClassCastException();
        NullPointerException();
        NegativeArraySizeException();
        NumberFormatException();
        StringIndexOutOfBoundsException();
        IllegalFormatConversionException();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    private static void FilenotFound() {
        try {
            File file = new File("D://file.txt");
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e2) {
            exceptions.add(e2);
        }
    }

    private static void ArrayIndexOutOfBoundException() {
        try {
            int num[] = {1, 2, 3, 4, 5};
            System.out.println(num[10]);
        } catch (ArrayIndexOutOfBoundsException e3) {
            exceptions.add(e3);
        }
    }

    private static void ArrayStoreException() {
        try {
            Object i[] = new String[5];
            i[0] = new Integer(0);
        } catch (ArrayStoreException e4) {
            exceptions.add(e4);
        }
    }


    private static void ClassCastException() {
        String str = null;
        try {
            Object x = new Integer(0);
            str = (String) x;
        } catch (ClassCastException e5) {
            exceptions.add(e5);
        }
    }

    private static void NullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e6) {
            exceptions.add(e6);
        }
    }

    private static void NegativeArraySizeException() {
        int a = -1;
        int b = -1001;
        try {
            int[] arr = new int[a + b];

        } catch (NegativeArraySizeException e7) {
            exceptions.add(e7);
        }

    }

    private static void NumberFormatException() {
        try {
            int num = Integer.parseInt("ABC");
            System.out.println(num);
        } catch (NumberFormatException e8) {
            exceptions.add(e8);
        }

    }

    private static void StringIndexOutOfBoundsException() {
        try {
            String str = "anystring";
            System.out.println(str.length());
            char ch = str.charAt(0);
            ch = str.charAt(55);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e9) {
            exceptions.add(e9);
        }

    }

    private static void IllegalFormatConversionException() {
        try {
            int x = 10;
            String name = "Tom";
            String a = "age";
            System.out.printf("%s %d %s", x, a, name);
        }
        catch (Exception e10) {
            exceptions.add(e10);
        }
    }
}