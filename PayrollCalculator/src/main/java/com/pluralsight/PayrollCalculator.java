package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner =new Scanner(System.in);

        //Ask the user's name
        System.out.println("Enter your Name?");
        String name= myScanner.next();

        //ask user for the first input
        System.out.println("How many hours did you work?");
        float hourWorked = myScanner.nextFloat();

        //Ask the pay rate
        System.out.println("Enter your pay rate");
        float payRate = myScanner.nextFloat();

        //do the math
        float grossPay = 0;
        if (hourWorked <= 40) {
            grossPay=multiplyNumbers(hourWorked, payRate);
        }
        else {
            float regularPay = multiplyNumbers(40, payRate);
            float overTimeHours =hourWorked - 40;
            float overTimePay= multiplyNumbers(overTimeHours,payRate *1.5f);
            grossPay = regularPay + overTimePay;

        }

        //Display the Gross pay
        System.out.printf("\nHello %s, your gross pay is $%.2f%n", name,grossPay);



    }
    public static float multiplyNumbers(float num1, float num2) {
        return num1 * num2;
    }
}
