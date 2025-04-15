package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        //Fire up the scanner to allow me to collect input from the user
        Scanner myScanner = new Scanner((System.in));

        //Read the user's choice of size of the sandwich
        System.out.print(" insert a number \n1: Regular: base price $5.45 \n 2: Large: base price $8.95");
        int order = myScanner.nextInt();

        //conditions for order
        double originalPrice = 0;
        if (order == 1) {
            originalPrice = 5.45;
        } else if (order == 2) {
            originalPrice = 8.95;
        } else {
            System.out.println("Invalid input");
        }

        //Read the user's age
        System.out.print("How old are you?\n");
        int age = myScanner.nextInt();

        //Loaded
        System.out.print("do you want your sandwich to be loaded?");


        double discount = (age <= 17) ? 0.1 : (age >= 65) ? 0.2 : 0;

        double finalPrice = originalPrice - (originalPrice * discount);
        System.out.printf("Your discount is %%%.0f and Your price after discount is: $%.2f%n", discount * 100, finalPrice);


    }

}
