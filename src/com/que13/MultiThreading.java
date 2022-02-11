package com.que13;


import java.util.Random;
import java.util.Scanner;

public class MultiThreading {
    public static void main(String[] args) {

        RandomNumber th = new RandomNumber();
        th.run();
    }
}
class RandomNumber extends Thread {
    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for which you want random numbers to be generated.");

        int numOfRandom = sc.nextInt();
        Random rdm = new Random();

        for (int i = 0; i < numOfRandom; i++) {
            int randomNumber = rdm.nextInt(100);

            System.out.println("Generating");
            for (int j =0; j < 5; j++) {
                System.out.println("..");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println(" ");
            if (randomNumber % 2 == 0) {
                SquareThread squareThread = new SquareThread (randomNumber);
                squareThread.start();
            } else {
                CubeThread cubeThread = new CubeThread (randomNumber);
                cubeThread.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
class SquareThread extends Thread {

    int number;
    SquareThread(int number) {
        this.number = number;
    }
    public void run () {
        System.out.println("Square of "+number+" : "+number * number);
    }
}
class CubeThread extends Thread {
    int number;
    CubeThread(int number) {
        this.number = number;
    }
    public void run () {
        System.out.println("Cube of "+number+" : "+number * number * number);
    }
}