package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("John", 32, "2345 First ln, Chicago WI");
        Man man2 = new Man("Mike", 56, "5467 Washington Rd, New-York NY");
        Woman woman1 = new Woman("Jane", 22, "65 Lilac ln, Georgetown, Washington D.C.");
        Woman woman2 = new Woman("Anna", 77, "754 South Way, Willing, IL");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

   public static class Man {
        String name;
        int age;
        String address;

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

   }
   public static class Woman {
       String name;
       int age;
       String address;

       public Woman (String name, int age, String address) {
           this.name = name;
           this.age = age;
           this.address = address;
       }
   }
}
