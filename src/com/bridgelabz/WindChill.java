package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    static void calculateWindChill(int temperature, int windSpeed) {
        if (temperature > 50 || windSpeed > 120 || windSpeed < 3) {
            System.out.println("!!Your values are within not range.Please give input within range.");
        }
        else {
            double v = Math.pow(windSpeed, 0.16);
            double res = 35.74 + 0.625 * temperature + (0.4275 * temperature - 35.75) * v;
            System.out.println("Wind chill is : " + res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in (Fahrenheit) [value must be less than 50] : ");
        int t = sc.nextInt();
        System.out.println("Enter Velocity in (miles per hour) [values must between 3 and 120] : ");
        int v = sc.nextInt();
        calculateWindChill(t,v);
    }
}