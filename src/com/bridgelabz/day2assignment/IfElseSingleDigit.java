package com.bridgelabz.day2assignment;

import java.util.Scanner;

public class IfElseSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("The given number is zero");
        }
        if (number == 1) {
            System.out.println("The given number is One");
        }
        if (number == 2) {
            System.out.println("The given number is Two");
        }
        if (number == 3) {
            System.out.println("The given number is Three");
        }
        if (number== 4) {
            System.out.println("The given number is Four");
        }
        if (number == 5) {
            System.out.println("The given number is Five");
        }
        if (number == 6) {
            System.out.println("The given number is Six");
        }
        if (number == 7) {
            System.out.println("The given number is Seven");
        }
        if (number== 8) {
            System.out.println("The given number is Eight");
        }
        if (number == 9) {
            System.out.println("The given number is Nine");
        }else{
            System.out.println("The given number is invalid");
        }
    }
}