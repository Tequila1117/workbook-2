package com.pluralsight.name;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your First Name");
       firstName = userInput.nextLine();

        System.out.println("Enter Your Middle Name");
        middleName = userInput.nextLine();

        System.out.println("Enter Your Last Name");
        lastName = userInput.nextLine();

        String fullName;
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("The Name You Provided Is " + fullName);



}
    }

