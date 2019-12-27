package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg = new Zerg();
        zerg.name = "Vasya";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Petya";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Kolya" ;
        Zerg zerg4 = new Zerg();
        zerg4.name = "Sasha";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Misha";
        Protoss pr = new Protoss();
        pr.name = "Berd";
        Protoss pr1 = new Protoss();
        pr1.name = "jary";
        Protoss pr2 = new Protoss();
        pr2.name = "Kolya";
        Terran t = new Terran();
        t.name = "Piz";
        Terran t2 = new Terran();
        t2.name = "Vetal";
        Terran t3 = new Terran();
        t3.name = "Vishny";
        Terran t4 = new Terran();
        t4.name = "Golova";
        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
