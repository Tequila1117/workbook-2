package com.pluralsight.name;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your First Name");
       firstName = userInput.nextLine().trim();

        System.out.println("Enter Your Middle Name");
        middleName = userInput.nextLine().trim();

        System.out.println("Enter Your Last Name");
        lastName = userInput.nextLine().trim();

        System.out.println("Enter Your Suffix If You Have One");
        suffix = userInput.nextLine().trim();
        String fullName;
        fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        System.out.println("The Name You Provided Is " + fullName);



}
    }

