package com.bridgelabz.Day1Problms;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2");
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Both Strings Are Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
