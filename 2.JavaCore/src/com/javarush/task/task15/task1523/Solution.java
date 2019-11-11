package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    int x;
    double y;
    short z;
    long l;

    public static void main(String[] args) {

    }

    public Solution(int x) {
        this.x = x;
    }
    protected Solution(double y) {
        this.y = y;
    }
    private Solution(short z) {
        this.z = z;
    }
    Solution(long l) {
        this.l = l;
    }
}

