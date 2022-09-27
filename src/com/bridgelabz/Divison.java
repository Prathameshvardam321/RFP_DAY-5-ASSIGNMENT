package com.bridgelabz;

import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int a = s.nextInt();
        System.out.println("Enter Divisor : ");
        int b = s.nextInt();
        int quotient=0;
        int remainder=0;
        quotient=a/b;
        remainder=a%b;
        System.out.println("Quotient ="+quotient);
        System.out.println("Remainder="+remainder);
    }
}
