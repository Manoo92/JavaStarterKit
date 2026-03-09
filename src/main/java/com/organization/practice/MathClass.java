package com.organization.practice;

import java.util.Scanner;

public class MathClass {

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double result1 = Math.pow(2, 3);
        System.out.println(result1);

        double result2 = Math.sqrt(3);
        System.out.println(result2);

        double result3 = Math.abs(2);
        System.out.println(result3);

        double result4 = Math.ceil(3.8966);
        System.out.println(result4);

        double result5 = Math.floor(3.89902);
        System.out.println(result5);

        double result6 = Math.round(3.575);
        System.out.println(result6);

        scanner.close();

    }
}
