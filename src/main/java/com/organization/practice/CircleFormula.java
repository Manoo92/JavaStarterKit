package com.organization.practice;

import java.awt.geom.Area;
import java.util.Scanner;

public class CircleFormula {

    static void main(String[] args){

        //Circumference = 2 * Pi * r
        //Area = Pi * r²
        //Volume = (4/3) * Pi * r³

        Scanner scanner = new Scanner(System.in);

        double circumference;
        double area;
        double volume;
        double r;

        System.out.print("Enter radius of a circle: ");
        r = scanner.nextDouble();

        circumference = 2 * Math.PI * r;
        System.out.printf("\nCircumference of a circle: %.2fcm", circumference);

        area = Math.PI * Math.pow(r,2);
        System.out.printf("\nArea of a circle:  %.2fcm²", area);

        volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        System.out.printf("\nVolume of a circle: %.2fcm³", volume);

        scanner.close();
    }
}
