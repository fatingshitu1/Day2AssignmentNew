package com.bridgelabz.day2assignment;

import java.util.Scanner;

public class IfElseDisplayUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("The given number is One");
        }
        if (number == 10) {
            System.out.println("The given number is Ten");
        }
        if (number == 100) {
            System.out.println("The given number is Hundred");
        }
        if (number == 1000) {
            System.out.println("The given number is Thousand");
        }
        if (number == 10000) {
            System.out.println("The given number is Ten Thousand");
        }
        if (number == 100000) {
            System.out.println("The given number is one lac");
        }
        if (number == 1000000) {
            System.out.println("The given number is Ten lac");
        }
        if (number == 10000000){
            System.out.println("The given number is one crore");
        } else {
            System.out.println("The given number is invalid");
        }
    }
}
