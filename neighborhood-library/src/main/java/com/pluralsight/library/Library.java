package com.pluralsight.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    // List to hold the collection of books
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        // Show a title banner
        System.out.println("=================================================");
        System.out.println("         THE WONDERFUL WORLD OF BOOKLAND                ");
        System.out.println("=================================================");

        // Initialize the book inventory
        showBooks();

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Variable to control the main loop

        // Main loop to keep the application running
        while (running) {
            // Show menu options
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt(); // Get user choice
            scanner.nextLine(); // Use newline character

            // Process user choice by using if-else statements
            if (choice == 1) {
                showAvailableBooks(scanner); // Show available books
            } else if (choice == 2) {
                showCheckedOutBooks(scanner); // Show checked out books
            } else if (choice == 3) {
                running = false; // Exit the loop
            } else {
                System.out.println("Invalid choice. Try again."); // Invalid choice handling
            }
        }
        scanner.close(); // Close the scanner
    }

    // Method to initialize the book inventory with list of books
    private static void showBooks() {
        books.add(new Book(1, "1001", "The Alchemist"));
        books.add(new Book(2, "1002", "The Four Agreements"));
        books.add(new Book(3, "1003", "The Fifth Agreement"));
        books.add(new Book(4, "1004", "Shook One"));
        books.add(new Book(5, "1005", "Tom Clancy's Power Plays"));
        books.add(new Book(6, "1006", "Junie B. Jones: Boss of Lunch"));
        books.add(new Book(7, "1007", "Amber Brown is Not a Crayon"));
        books.add(new Book(8, "1008", "The Hunger Games"));
        books.add(new Book(9, "1009", "The Mastery of Love"));
        books.add(new Book(10, "1010", "The Gifts of Imperfection"));
        books.add(new Book(11, "1011", "Atomic Habits"));
        books.add(new Book(12, "1012", "Harry Potter"));
        books.add(new Book(13, "1013", "12 Months to $1 Million"));
        books.add(new Book(14, "1014", "Get Good with Money"));
        books.add(new Book(15, "1015", "The Power of Patience"));
        books.add(new Book(16, "1016", "Get Out of Your Own Way"));
        books.add(new Book(17, "1017", "The Positive Shift"));
        books.add(new Book(18, "1018", "You Become What You Think"));
        books.add(new Book(19, "1019", "Not Nice"));
        books.add(new Book(20, "1020", "The Book You Wish Parents Had Read"));
    }

    // Method to display available books and handle check out
    private static void showAvailableBooks(Scanner scanner) {
        System.out.println("Available Books:");
        // Loop through the list of books
        for (Book book : books) {
            // Check if the book is not checked out
            if (!book.isCheckedOut()) {
                // Print book details
                System.out.printf("ID: %d, ISBN: %s, Title: %s%n", book.getId(), book.getIsbn(), book.getTitle());
            }
        }
        System.out.print("Enter the ID of the book to check out or type 'exit' to go back): ");
        String input = scanner.nextLine(); // Get user input
        // Check if the user wants to exit
        if (!input.equalsIgnoreCase("exit")) {
            int bookId = Integer.parseInt(input); // Parse the book ID
            System.out.print("Enter your name: "); // Prompt for user name
            String name = scanner.nextLine(); // Get user name
            checkOutBook(bookId, name); // Check out the book
        }
    }

    // Method to check out a book based on ID and user name
    private static void checkOutBook(int bookId, String name) {
        // Loop through the list of books
        for (Book book : books) {
            // Check if the book matches the ID and is not checked out
            if (book.getId() == bookId && !book.isCheckedOut()) {
                book.checkOut(name); // Mark the book as checked out
                System.out.println("You have checked out: " + book.getTitle());
                return; // Exit the method
            }
        }
        System.out.println("Book not found or already checked out."); // Error message
    }

    // Method to display checked out books and handle check in
    private static void showCheckedOutBooks(Scanner scanner) {
        System.out.println("Checked Out Books:");
        // Loop through the list of books
        for (Book book : books) {
            // Check if the book is checked out
            if (book.isCheckedOut()) {
                // Print book details and who has it checked out
                System.out.printf("ID: %d, ISBN: %s, Title: %s, Checked out to: %s%n",
                        book.getId(), book.getIsbn(), book.getTitle(), book.getCheckedOutTo());
            }
        }
        System.out.print("Enter the ID of the book to check in (or type 'x' to go back): ");
        String input = scanner.nextLine(); // Get user input
        // Check if the user wants to go back
        if (!input.equalsIgnoreCase("x")) {
            int bookId = Integer.parseInt(input); // Parse the book ID
            checkInBook(bookId); // Check in the book
        }
    }

    // Method to check in a book based on ID
    private static void checkInBook(int bookId) {
        // Loop through the list of books
        for (Book book : books) {
            // Check if the book matches the ID and is checked out
            if (book.getId() == bookId && book.isCheckedOut()) {
                book.checkIn(); // Mark the book as checked in
                System.out.println("You've just checked in: " + book.getTitle());
                return; // Exit the method
            }
        }
        System.out.println("Book not found or not checked out."); // Error message
    }
}