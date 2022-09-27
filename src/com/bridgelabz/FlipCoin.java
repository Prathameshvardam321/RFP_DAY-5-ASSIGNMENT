package com.bridgelabz;
import java.util.*;

public class FlipCoin {
    public static void main(String[] args) {
        Random r = new Random();
        double Heads=0;
        double Tails=0;
        System.out.println("Enter number to flip coins : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Flipping coins");
        for (int i = 1 ; i <= n ; i++){
            int result = r.nextInt(2);
            if (result==0){
                System.out.println("Tails");
                Tails++;
            }
            else {
                System.out.println("Heads");
                Heads++;
            }

        }
        double percentHeads=(Heads/n)*100;
        double percentTails=(Tails/n)*100;
        System.out.println("Percentage of Heads is " +percentHeads);
        System.out.println("Percentage of Tails is " +percentTails);
    }
}
