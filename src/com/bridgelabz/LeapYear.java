package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void IsLeap(int k){
        boolean IsLeap = false;
        if (k%4==0){
            IsLeap=true;
            if (k%100==0){
                if (k%400==0){
                    IsLeap = true;
                }
                else {
                    IsLeap=false;
                }
            }
        }
        if (IsLeap == true){
            System.out.println(k+" is Leap year");
        }
        else {
            System.out.println(k+" is Not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter year : ");
        int year = scan.nextInt();
        int temp = year;
        int count = 0;
        while (year>0){
            year=year/10;
            count++;
        }
        //checking input from user is 4 digit or not


        if (count==4){
            IsLeap(temp);
        }
        else {
            System.out.println( " Error !!! Enter four digit years only " );
        }
    }
}

