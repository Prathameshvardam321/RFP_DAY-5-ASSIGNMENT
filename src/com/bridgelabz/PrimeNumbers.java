package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        // 2 3 5 7 11 13 17 19 23 29
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number to check prime or not: ");
        int n = s.nextInt();
        int count =0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                count=1;
                break;
            }
        }
        if (count==0){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Number is not prime.");
        }

    }
}
