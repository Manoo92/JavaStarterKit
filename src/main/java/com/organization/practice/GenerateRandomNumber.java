package com.organization.practice;

import java.util.Random;

public class GenerateRandomNumber{

    public static void main(String[] args){

        Random random = new Random();

        int number1;
        double number2;

        number1 = random.nextInt(1, 10);
        System.out.println("Latest number : " +number1);

        number2 = random.nextDouble(1, 5);
        System.out.println("Latest number : " +number2);
    }
}