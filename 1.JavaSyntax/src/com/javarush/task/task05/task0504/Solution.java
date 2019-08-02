package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
       Cat cat1 = new Cat ("Barsik", 5, 10, 30);
       Cat cat2 = new Cat ("Murzik", 2, 2, 10);
       Cat cat3 = new Cat ("Vasya", 1, 5, 20);


    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}