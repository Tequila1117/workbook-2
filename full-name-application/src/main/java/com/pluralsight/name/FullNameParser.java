package com.pluralsight.name;

import java.util.Scanner;
public class FullNameParser {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter enter your full name:");
        String fullName = userInput.nextLine().trim();

        // Split the name by spaces
        String[] nameParts = fullName.split("\\s+");

        String firstName = nameParts[0]; // First part is the first name
        String middleName = (nameParts.length == 3) ? nameParts[1] : "(none)"; // Second part is middle name if avail
        String lastName = nameParts[nameParts.length - 1]; // Last part is the last name

        // Output the results
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        userInput.close(); // Close the scanner
    }

}
