package com.organization.practice;

public class TestOne {
    void main(String[] args){
        String name = "Manogna Vadlamudi";
        int age = 30;
        double gpa = 3.5;
        char initial = 'M';
        boolean isAdmin = false;

        System.out.println("My name is: " + name);
        System.out.println("My age is: " +age);
        System.out.println("My gpa is: " +gpa);
        System.out.println("My initial is: " +initial);

        if(isAdmin){
            System.out.println(initial + " is Admin");
        }
        else {
            System.out.println(initial+ " is NOT Admin");
        }
    }
}
