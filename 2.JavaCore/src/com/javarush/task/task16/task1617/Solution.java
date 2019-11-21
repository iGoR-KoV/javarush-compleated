package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (numSeconds > 0 & !isInterrupted()) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                }
                        System.out.print("Марш!");
                    } catch (InterruptedException e) {
                        System.out.print("Прервано!");
                    }
                }

//            if (numSeconds == 3) {
//
//                for (int i = numSeconds; i >= 1; i--) {
//
//                    System.out.print(numSeconds-- + " ");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.print("Марш!");
//            } else if (numSeconds == 4) {
//                for (int i = numSeconds; i >= 1; i--) {
//                    System.out.println(numSeconds-- + " ");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println("Прервано!");
//            }
        }

    }

