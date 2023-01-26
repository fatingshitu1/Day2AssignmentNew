package com.bridgelabz.day2assignment;

public class ForLoopReverseNumber {
    public static void main(String[] args) {
        int num = 231;
        int x = num % 10;
        for (int i = 1; i < num; i++) {
            num = num / 10;
            num += i;
            System.out.print(i);
        }
    }
}
