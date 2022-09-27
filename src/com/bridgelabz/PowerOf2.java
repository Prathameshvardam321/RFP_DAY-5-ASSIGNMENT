package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter value of power(value should be less than 31) : ");
        double n = s.nextDouble();
        double value=0;
        for (int  i =0;i<=n;i++){
            value=Math.pow(2,i);
            System.out.println("2^"+i+"="+value);
        }
    }
}
