package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Андрей Павлович", true, 78);
        Human grandMother1 = new Human("Олена Ивановна", false, 75);
        Human grandFather2 = new Human("Евгений Петрович", true, 80);
        Human grandMother2 = new Human("Мария Степановна", false, 77);
        Human father = new Human("Сергей Андреевич", true, 48);
        Human mother = new Human("Ольга Евгениевна", false, 44);
        Human daughter1 = new Human("Марина", false, 24);
        Human daughter2 = new Human("Жанна", false, 20);
        Human son = new Human("Олег", true, 22);
        grandFather1.children.add(father);
        grandMother1.children.add(father);
        grandFather2.children.add(mother);
        grandMother2.children.add(mother);
        father.children.add(daughter1);
        father.children.add(daughter2);
        father.children.add(son);
        mother.children.add(daughter1);
        mother.children.add(daughter2);
        mother.children.add(son);



        System.out.println(grandFather1 + "\n" + grandMother1 + "\n" + grandFather2+ "\n" +grandMother2+ "\n" +father+ "\n" +mother+ "\n" +daughter1+ "\n" +daughter2+ "\n" +son);
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;

        ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
