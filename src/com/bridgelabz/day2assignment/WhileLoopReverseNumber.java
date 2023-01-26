package com.bridgelabz.day2assignment;

public class WhileLoopReverseNumber {
    public static void main(String[] args) {
        int num = 231;
        while (num > 0) {
            int r = num % 10;
            System.out.print(r);
            num = num / 10;
        }
    }
}
