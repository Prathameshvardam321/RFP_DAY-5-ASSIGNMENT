package com.bridgelabz;

import java.util.Random;

public class Sample {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i=1;i<=10;i++) {
            int x = rand.nextInt(2);
            System.out.println(x);
            if (x == 1) {
                System.out.println("Its heads");
            } else {
                System.out.println("Its tails");
            }
        }
    }
}
