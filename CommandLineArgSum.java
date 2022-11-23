package com.bridgelabz.Day1Problms;

import java.util.Scanner;

public class CommandLineArgSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("The sum of x and y is: " +sum);
    }
}
