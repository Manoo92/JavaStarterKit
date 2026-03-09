package com.organization.practice;

import java.util.Scanner;

public class HypotenuseOfTriangle {

    static void main(String[] args){

        //Hypotenuse = Sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);
        double hypotenuse;
        double a;
        double b;

        System.out.print("Enter value of a: ");
        a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        b = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(2,a) * Math.pow(2, b));

        System.out.println("Hypotenuse of a triangle: " +hypotenuse);


        scanner.close();
    }

}
