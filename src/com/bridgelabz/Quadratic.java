package com.bridgelabz;

public class Quadratic {
    static void checkQuadratic(double a,double b,double c){

        double delta = b*b-4*a*c;
        double sq = Math.pow(delta,0.5);
        double r1=-b+(sq/2*a);
        double r2=-b-(sq/2*a);
        System.out.println("Value of r1 :"+r1);
        System.out.println("Value of r2 :"+r2);

    }

    public static void main(String[] args) {
        checkQuadratic(41.4,621,431);
    }
}
