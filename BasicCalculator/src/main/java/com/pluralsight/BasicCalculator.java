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
        myScanner.nextLine();

        //Menu options
        System.out.println("\nPossible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        //Ask for the user's options
        System.out.print("Please select an option:");
        String option = myScanner.nextLine().toUpperCase();

        //Display user's option
        System.out.println("The user chose " + option);

        //Perform operation
        float result = 0;
        String operation = "";

        if (option.equals("A")){
            result = add(num1,num2);
            operation ="+";
        }
        else if (option.equals("S")) {
            result = subtract(num1, num2);
            operation = "-";
        } else if (option.equals("M")) {
            result = multiply(num1, num2);
            operation = "*";
        } else if (option.equals("D")) {
            if (num2 != 0) {
                result = divide(num1, num2);
                operation = "/";
            } else {
                System.out.println("Error: Cannot divide by zero.");
                myScanner.close();
                return;
            }
        } else {
            System.out.println("Invalid option.");
            myScanner.close();
            return;
        }

        //output

        System.out.printf("%.2f * %.2f = %.2f%n" ,num1,num2,result);
        myScanner.close();


    }
    //Static methods for each operation
    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
}}
