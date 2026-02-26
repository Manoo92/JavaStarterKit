package com.organization.practice;

import java.util.Scanner;

public class ShoppingCart {

    /* Shopping Cart
    * What would like to buy:
    * What is the price for each
    * How many would you like to buy:
    * You have bought {number of items}
    * Total price is : ${price}*/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy: " );
        item = scanner.nextLine();
        System.out.print("What is the price for each " +item+ ": ");
        price = scanner.nextDouble();
        System.out.print("How many would you like to buy: ");
        quantity = scanner.nextInt();
        System.out.println("\nYou have bought " +quantity+" " +item+ "s");

        total = price * quantity;
        System.out.print("Total price is: " +currency+total+ ".");

        scanner.close();
    }
}
