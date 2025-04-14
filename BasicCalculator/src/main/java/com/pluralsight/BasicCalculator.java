package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //fire up the scanner to allow me to collect input from the user
        Scanner myScanner = new Scanner(System.in);

        //Read two floating numbers
        System.out.print("Enter the first number:");
        float num1 = myScanner.nextFloat();
        System.out.print("Enter the second number");
        float num2 = myScanner.nextFloat();

        //Menu options
        System.out.println("\nPossible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        //Ask for the user's options
        System.out.print("Please select an option\n");
        String option = myScanner.nextLine();

        //Always multiply regardless of option
        float result = multiplication(num1,num2);
        System.out.printf("%.2f * %.2f = %.2f%n" ,num1,num2,result);
        myScanner.close();


    }
    public static float multiplication(float num1, float num2){
        return num1 * num2;
}}
