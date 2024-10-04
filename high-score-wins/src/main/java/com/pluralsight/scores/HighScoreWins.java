package com.pluralsight.scores;

import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Get input from user by:
        System.out.print("Enter game scores in the format 'Heat:Celtics|scoreHeat:scoreCeltics': ");
        String input = userInput.nextLine();

        // Split the input into team names and scores:
        String[] parts = input.split("\\|");

        if (parts.length != 2) {
            System.out.println("Invalid response. Please use this format 'Heat:Celtics|scoreHeat:scoreCeltics'.");
            userInput.close();
            return;
        }

        String teams = parts[0];  // This is "Heat:Celtics"
        String scores = parts[1];  // This is "scoreHeat:scoreCeltics"

        // Split the team names:
        String[] teamNames = teams.split(":");
        String heatTeam = teamNames[0];      // "Heat"
        String celticsTeam = teamNames[1];   // "Celtics"

        // Split the scores:
        String[] scoreValues = scores.split(":");
        int heatScore = Integer.parseInt(scoreValues[0]);        // Score for Heat
        int celticsScore = Integer.parseInt(scoreValues[1]);    // Score for Celtics

        // Determine and output the result:
        if (heatScore < celticsScore) {
            System.out.println("The Celtics Team Won!!!"); // Output result
        } else if (heatScore > celticsScore) {
            System.out.println("The Heat team Won!!!");
        } else {
            System.out.println("The Score was a Tie!!!");
        }


    }
}