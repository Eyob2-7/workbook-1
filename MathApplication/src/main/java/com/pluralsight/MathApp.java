package com.pluralsight;

public class MathApp {
    //this is the main method and where my code will run from
    //all code I am writing will be in this main
    public static void main(String[] args) {

        //Determine whose salary is greater
        double bobSalary = 55000;
        double garySalary=100000;
        double highestSalary= Math.max(garySalary,bobSalary);
        System.out.println("the highest salary is" + " " + highestSalary);
        System.out.println("------------------------------");

       // Find and display the smallest of two salaries
        int carPrice= 32000;
        int truckPrice= 44000;

        System.out.println("the smallest is " + Math.min(carPrice,truckPrice));
        System.out.println("------------------------------");

        //Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double areCircle = Math.PI * (Math.pow(radius,2));
        System.out.println("The area of the circle is " + areCircle);
        System.out.println("------------------------------");

        //Find and display the square root a variable after it is set to 5.0
        float x =5.0f;
        System.out.println("the square root is " + Math.sqrt(x));
        System.out.println("------------------------------");

       // Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5d;
        double y1 = 10d;
        double x2 = 85d;
        double y2 = 50d;
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.printf("The distance between (%.0f,%.0f) and (%.0f,%.0f) is %.2f%n" ,x1, y1, x2, y2, distance);
        System.out.println("------------------------------");

        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        double value= -3.8d;
        System.out.printf("The absolute value of %.1f is %.1f%n", value, Math.abs(value));
        System.out.println("------------------------------");

        //Find and display a random number between 0 and 1
        double random = Math.random();
        System.out.println("The random number between 0 and 1 is " + random);
        System.out.println("------------------------------");










    }
}
