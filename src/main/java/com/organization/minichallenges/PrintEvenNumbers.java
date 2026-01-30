package com.organization.minichallenges;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
