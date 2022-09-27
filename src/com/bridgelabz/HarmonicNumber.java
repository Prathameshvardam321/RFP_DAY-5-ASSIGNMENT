package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number N : ");
        double n = s.nextDouble();
        double sum = 0, i=1;
        System.out.print("The harmonic numbers are : ");
        while (i<=n){
            if (i==n){
                sum=sum+1/n;
                System.out.print(sum+" .");
                i++;
                break;
            }
            sum = sum + 1 / n;
            System.out.print(sum + ",");
            i++;
        }
    }
}
