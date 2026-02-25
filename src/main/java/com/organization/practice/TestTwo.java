package com.organization.practice;

import java.util.Scanner;

public class TestTwo {

    public static void main(String[] args){

        //Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        area = width* height;

        //use ctrl+cmd+space for square
        System.out.println("area of the rectangle: " +area + "cm²" );
        scanner.close();
    }
}
