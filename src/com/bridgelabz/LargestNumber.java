package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a = s.nextInt();
        System.out.println("Enter Number 2: ");
        int b = s.nextInt();
        System.out.println("Enter Number 3: ");
        int c = s.nextInt();
        if (a>b&&a>c){
            System.out.println(a);
        }
        if (b>a&&b>c){
            System.out.println(b);
        }
        if (c>a&&c>b){
            System.out.println(c);
        }
    }
}
