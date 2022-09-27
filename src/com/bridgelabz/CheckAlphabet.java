package com.bridgelabz;


import java.util.Scanner;

public class CheckAlphabet {
    static void alphabet(char s){
switch (s){
    case 'a'  :
        System.out.println("It is vowel");
        break;
    case 'e' :
        System.out.println("It is vowel");
        break;
    case 'i' :
        System.out.println("It is vowel");
        break;
    case 'o' :
        System.out.println("It is vowel");
        break;
    case 'u' :
        System.out.println("It is vowel");
        break;
    case 'A'  :
        System.out.println("It is vowel");
        break;
    case 'E'  :
        System.out.println("It is vowel");
        break;
    case 'I'  :
        System.out.println("It is vowel");
        break;
    case 'O'  :
        System.out.println("It is vowel");
        break;
    case 'U'  :
        System.out.println("It is vowel");
        break;
    default:
        System.out.println("Its is consonant");
}


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string : ");
        char c = s.next().charAt(0);
        alphabet(c);

    }
}
