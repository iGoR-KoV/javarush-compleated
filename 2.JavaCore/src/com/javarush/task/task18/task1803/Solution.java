package com.javarush.task.task18.task1803;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName=new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream=new FileInputStream(fileName);
        /*----------------------------------*/
        //массив где будут индексы-"высота байта",значения счетчик частоты этих байт
        byte [] bytes=new byte[256];
        byte byteHigh;
        //заносим в массив
        while(fileInputStream.available()>0){
            byteHigh=(byte)fileInputStream.read();
            bytes[byteHigh]+=1;
        }
        /*-----------------------------------*/
        //вычисляем "наибольшую частоту встречаемости байта"
        int maxValue=bytes[0];
        for(int i=0;i<bytes.length;i++){
            int tmpData=(int)bytes[i];
            if(tmpData>maxValue)
                maxValue=tmpData;
        }

        /*-----------------------------------*/
        //в соответствии с частотой выводим байт
        for(int i=0;i<bytes.length;i++){
            if (bytes[i]==maxValue){
                System.out.print(i);
                System.out.print(" ");
            }
        }

        fileInputStream.close();
        System.in.close();
        System.out.close();
    }
}
