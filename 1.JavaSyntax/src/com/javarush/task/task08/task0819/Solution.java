package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> it = cats.iterator();
        cats.remove(it.next());

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2

        Set<Cat> cats = new HashSet<>();

        cats.add(Cat.cat1);
        cats.add(Cat.cat2);
        cats.add(Cat.cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4

        for (Cat s : cats) {
            System.out.println(s);
        }
    }

    public static class Cat {
        // step 1 - пункт 1
        static Cat cat1 = new Cat();
        static Cat cat2 = new Cat();
        static Cat cat3 = new Cat();

    }

}
