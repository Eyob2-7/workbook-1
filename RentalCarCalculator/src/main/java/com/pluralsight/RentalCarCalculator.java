package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        //Setup Scanner
        Scanner input = new Scanner(System.in);

        // Ask the user when they want to pick up the car
        System.out.print("Pick up date (mm/dd/yyyy): ");
        String pickUpDate = input.nextLine();
        // Ask for  rental days
        System.out.print("Number of rental days : ");
        int rentalDays = input.nextInt();
        input.nextLine();
        // Ask the user their age
        System.out.print("How old are you?");
        int age = input.nextInt();
        input.nextLine();

        //yes/no option
        String wantsTollTag = askYesOrNo(input,"Do you want an electronic toll tag at $3.95/day (yes/no)");
        //whether they want a GPS at $2.95/day (yes/no)
        String wantsGps = askYesOrNo(input,"Do you want a GPS at $2.95/day (yes/no)");
        //roadside assistance (yes/no)
        String wantsRoadSide = askYesOrNo(input,"Do you want a roadside assistance (yes/no)");

        //Calculate total cost
        double totalCost =calculateTotalCost(rentalDays,wantsTollTag,wantsGps,wantsRoadSide,age);

        // Close Scanner
        input.close();


    }
     public static String askYesOrNo(Scanner input, String message){
        String response;
        while (true){
            System.out.print(message);
            response = input.nextLine().trim().toLowerCase();
            if (response.equals("yes") || response.equals("no")){
                break;
            }
            System.out.println("Please enter (yes/no)");
        }
        return response;
     }
     public static double calculateTotalCost(int rentalDays, String wantsTollTag, String wantsGps,String wantsRoadSide, int age){
        double baseRate = 29.99;
        double basicRental = baseRate * rentalDays;

        double tollTagCost = wantsTollTag.equals("yes")? 3.95 * rentalDays:0;
        double gpsCost = wantsGps.equals("yes")? 2.95 * rentalDays:0;
        double roadSideCost = wantsRoadSide.equals("yes")? 3.95 * rentalDays:0;

        double optionsCost = tollTagCost + gpsCost + roadSideCost;

        double underAgeSurcharge = (age < 25) ? basicRental * 0.3 : 0;
        double total = basicRental + optionsCost + underAgeSurcharge;

         // Show the result to the user
         System.out.println("\n--- Receipt ---");
         System.out.printf("Base Rate Per Day :$%.2f%n ", baseRate);
         System.out.printf("Basic Car Rental (%d days):$%.2f%n ", rentalDays,basicRental);
         System.out.printf("Options Cost: $%.2f%n", optionsCost);
         System.out.printf("Toll Tag: $%.2f%n", tollTagCost);
         System.out.printf("GPS: $%.2f%n", gpsCost);
         System.out.printf("Roadside Assistance: $%.2f%n", roadSideCost);
         System.out.printf("Underage surcharge: $%.2f%n", underAgeSurcharge);
         System.out.printf("Total Cost: $%.2f%n", total);
      return total;
     }
}

