package com.bridgelabz.day2assignment;

import java.util.Scanner;

public class SwitchVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Char");
        char ch = scanner.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch +  "Vowel");
                break;
            default:
                System.out.println("This is a Consonant");
        }
    }
}
