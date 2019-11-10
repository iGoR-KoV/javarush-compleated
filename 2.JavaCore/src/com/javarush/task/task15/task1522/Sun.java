package com.javarush.task.task15.task1522;

public class Sun implements Planet {

    private static Moon instance;

    private Sun(){}

    public static Moon getInstance(){
//        if(instance == null){
//            instance = new Moon();
//        }
        return instance;
    }
}
