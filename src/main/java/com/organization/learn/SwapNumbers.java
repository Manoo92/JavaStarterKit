package com.organization.learn;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("initial value of a : " + a);
        System.out.println("initial value of b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("--numbers after swap--");
        System.out.println("Swapped value : " + a);
        System.out.println("Swapped value : " + b);
    }
}
