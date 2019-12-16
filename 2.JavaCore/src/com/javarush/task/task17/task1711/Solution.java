package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c": {
//                -c name1 sex1 bd1 name2 sex2 bd2
                synchronized (allPeople) {
                    int amount = (args.length - 1) / 3;
                    for (int i = 1; i < amount*3; i = i+3) {
                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2]);
                        if (args[i + 1].equals("м")) allPeople.add(Person.createMale(args[i], date));
                        else allPeople.add(Person.createFemale(args[i], date));


                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            }
            case "-d": {
                synchronized (allPeople) {
                    int amount = (args.length - 1);
                    for (int i = 1; i < amount+1; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                    break;
                }
            }

            case "-u": {
                synchronized (allPeople) {
                    //   -u id name sex bd

                    int amount = (args.length - 1) / 4;
                    for (int i = 1; i < amount*4; i += 4) {
                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]);
                        Person upd;
                        if (args[i + 2].equals("м")) {
                            upd = Person.createMale(args[i + 1], date);
                        } else upd = Person.createFemale(args[i + 1], date);
                        allPeople.set(Integer.parseInt(args[i]), upd);
                    }
                    break;

                }
            }

            case "-i": {

                synchronized (allPeople) {
                    int amount = (args.length - 1);

                    String sex = new String();
                    for (int i = 1; i < amount + 1; i++) {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String sDate = sdf.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate());
                        if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.MALE) sex = "м";
                        else sex = "ж";
                        System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + sex + " " + sDate);
                    }
                    break;
                }
            }
        }
    }
}
