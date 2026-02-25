package com.organization.practice;

import java.util.Scanner;

public class MadLibsGame {

    /** Mad Libs game
     * Today I went to {adjective} zoo
     * In an exbhit, I saw {noun}
     * {noun} was {adjective} and {verb}
     * I was {adjective} */
    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter a adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (name): ");
        noun = scanner.nextLine();

        System.out.print("Enter adjective (describe the noun): ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter verb (action): ");
        verb = scanner.nextLine();

        System.out.println("Enter adjective (your reaction): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to " + adjective1 + " zoo");
        System.out.println("In an exbhit, I saw " + noun);
        System.out.println(noun + " was " + adjective2 + " and " + verb + "ing");
        System.out.println("I was " + adjective3);

        scanner.close();

    }
}
