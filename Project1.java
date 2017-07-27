import java.util.Scanner;

/**
 * File: Project1.java
 * Author: William Crutchfield
 * Date: January 24, 2016
 * Description: This program is meant to allow the user to enter demographic information.
 */
public class Project1 {

    public static void main(String[] args) {

        // Variables
        short birthYear;
        byte birthMonth;
        byte birthDay;
        double latitude;
        double longitude;
        double gpa;

        Scanner scannerIn = new Scanner(System.in);     // Takes user input

        // Enter birthYear
        System.out.println("Enter your birth year (1900-2014):");
        birthYear = scannerIn.nextShort();

        // Enter birthMonth
        System.out.println("Enter your birth month (1-12):");
        birthMonth = scannerIn.nextByte();

        // Enter birthDay
        System.out.println("Enter the day of the month of your birth (1-31):");
        birthDay = scannerIn.nextByte();

        // Enter latitude
        System.out.println("Enter the latitude of your home address:");
        latitude = scannerIn.nextDouble();

        // Enter longitude
        System.out.println("Enter the longitude of your home address:");
        longitude = scannerIn.nextDouble();

        // Enter gpa
        System.out.println("Enter your current GPA(0.0-4.0):");
        gpa = scannerIn.nextDouble();

        // Print the results
        System.out.println("********** Thank you for completing our survey **********");
        System.out.println("You have entered the following data:");
        System.out.print("Birthday: ");

        // Prints the name of birthMonth (Ex. 1 -> January)
        switch (birthMonth) {
            case 1:
                // Print out January
                System.out.print("January");
                break;
            case 2:
                // Print out Februrary
                System.out.print("Februrary");
                break;
            case 3:
                // Print out March
                System.out.print("March");
                break;
            case 4:
                // Print out April
                System.out.print("April");
                break;
            case 5:
                // Print out May
                System.out.print("May");
                break;
            case 6:
                // Print out June
                System.out.print("June");
                break;
            case 7:
                // Print out July
                System.out.print("July");
                break;
            case 8:
                // Print out August
                System.out.print("August");
                break;
            case 9:
                // Print out September
                System.out.print("September");
                break;
            case 10:
                // Print out October
                System.out.print("October");
                break;
            case 11:
                // Print out November
                System.out.print("November");
                break;
            case 12:
                // Print out December
                System.out.print("December");
                break;
        }

        // Prints remaining data
        System.out.println(" " + birthDay + "," + birthYear);
        System.out.println("Address: Latitude " + latitude + "\u00B0, Longitude " + longitude + "\u00B0");
        System.out.println("Current GPA: " + gpa);
    }
}

