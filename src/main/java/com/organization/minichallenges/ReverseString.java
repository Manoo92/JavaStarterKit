package com.organization.minichallenges;

public class ReverseString {
    static void main() {
        String s = "Java";
        for(int i = s.length()-1; i>=0; i--){
            System.out.println(s.charAt(i));
        }
    }
}
