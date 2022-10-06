package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to get prime factors: ");
        int count = 0;
        int n = scan.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                for (int j=2;j<i;j++){
                    if (i%j==0){
                    count=1;
                    break;    

                    }
                else {
                    count=0;
                }
            }
                if (count==0){
                    System.out.println("Prime factors :"+i);
                }
            }

        }
    }
}
