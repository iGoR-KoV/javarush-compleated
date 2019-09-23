package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private String country;
        private String maritalStatus;

        public Human (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Human (String lastName, boolean sex) {
            this.lastName = lastName;
            this.sex = sex;
        }
        public Human (String firstName, String lastName, String country) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.country = country;
        }
        public Human (String firstName, String maritalStatus, int age) {
            this.firstName = firstName;
            this.maritalStatus = maritalStatus;
            this.age = age;
        }
        public Human (String firstName, String lastName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }
        public Human (String firstName, String lastName, int age, boolean sex, String country) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.country = country;
        }
        public Human (String firstName, String lastName, int age, boolean sex, String country, String maritalStatus) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.country = country;
            this.maritalStatus = maritalStatus;
        }
        public Human (String lastName, int age, boolean sex, String country, String maritalStatus) {
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.country = country;
        }
        public Human (String lastName, int age, String country) {
            this.lastName = lastName;
            this.age = age;
            this.country = country;
        }
        public Human (String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

    }

}
