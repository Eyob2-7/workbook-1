package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        //Fire up the scanner to allow me to collect input from the user
        Scanner myScanner = new Scanner((System.in));

        //Read the user's choice of size of the sandwich
        System.out.print(" insert a number \n1: Regular: base price $5.45 \n 2: Large: base price $8.95");
        int order = myScanner.nextInt();

        //Set base price
        double originalPrice = 0;
        if (order == 1) {
            originalPrice = 5.45;
        } else if (order == 2) {
            originalPrice = 8.95;
        } else {
            System.out.println("Invalid input");
            return;
        }

        //Ask if the user wants their sandwich to be loaded
        myScanner.nextLine();
        System.out.print("would you like the sandwich loaded?(yes/no):");
        String loadedChoice = myScanner.nextLine().toLowerCase();

        double loadedCost = 0;
        if (loadedChoice.equals("yes")) {
            if (order == 1) {
                loadedCost = 1;
            } else if (order == 2) {
                loadedCost = 1.75;

            }
            originalPrice += loadedCost;
            System.out.printf("Loaded sandwich extra cost $%.2f%n", loadedCost);
        }

        //Read the user's age
        System.out.print("How old are you?\n");
        int age = myScanner.nextInt();

         //Apply discount
        double discount = (age <= 17) ? 0.1 : (age >= 65) ? 0.2 : 0;
        double finalPrice = originalPrice - (originalPrice * discount);

        //show final result
        System.out.printf("Your discount is %.0f%% and Your price after discount is: $%.2f%n", discount * 100, finalPrice);

        myScanner.close();
    }

}
