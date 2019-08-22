package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human grandFather1 = new Human("Bill", true, 78);
        Human grandFather2 = new Human("John", true, 81);
        Human grandMother1 = new Human("Barbara", false, 72);
        Human grandMother2 = new Human("Mary", false, 76);
        Human father = new Human("Tom", true, 49, grandFather2, grandMother2);
        Human mother = new Human("Jennifer", false, 45, grandFather1, grandMother1);
        Human son = new Human("Tommy", true, 22, father, mother);
        Human daughter1 = new Human("Molly", false, 20, father, mother);
        Human daughter2 = new Human("Ann", false, 18, father, mother);

    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       Human father;
       Human mother;

       public Human (String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
           System.out.println(toString());
       }

       public Human (String name, boolean sex, int age, Human father, Human mother) {
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.father = father;
           this.mother = mother;
           System.out.println(toString());
       }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}