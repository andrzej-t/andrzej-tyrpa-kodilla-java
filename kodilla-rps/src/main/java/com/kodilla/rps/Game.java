package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static String generateComputerChoice(Random random) {
        int wordNumber;
        wordNumber = random.nextInt(3) + 1;
        String computerWordChoice = "";

        if (wordNumber == 1) {
            computerWordChoice = "Rock";
        } else if (wordNumber == 2) {
            computerWordChoice = "Paper";
        } else if (wordNumber == 3) {
            computerWordChoice = "Scissors";
        }
        System.out.println("\nThe computer has already chosen move ");
        return computerWordChoice;
    }

    public static void showMenu() {
        System.out.println("\nYou can choose:  [Rock]   [Paper]   [Scissors]  n - Restart Game x - Exit");
    }

    public static String getUserChoice(Scanner scanner) {
        String userWordChoice;
        System.out.println("\nPlease, make your choice: ");
        userWordChoice = scanner.nextLine();

        return userWordChoice;
    }


    public static String chooseWinner(String computerChoice, String userChoice) {
        String winner = "Nobody";
        String finalMessage;

        if (computerChoice.equals("Rock") && userChoice.equalsIgnoreCase("Scissors")) {
            winner = "Computer";
        } else if (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) {
            winner = "You";
        }

        if (computerChoice.equals("Scissors") && userChoice.equalsIgnoreCase("Paper")) {
            winner = "Computer";
        } else if (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) {
            winner = "You";
        }

        if (computerChoice.equals("Paper") && userChoice.equalsIgnoreCase("Rock")) {
            winner = "Computer";
        } else if (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) {
            winner = "You";
        }


        finalMessage = winner + " won this round!";
        return finalMessage;
    }

    public void start() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        boolean end = false;


        while (!end) {
            showMenu();
            computerChoice = generateComputerChoice(random);
            userChoice = getUserChoice(scanner);
            System.out.println("You chose: " + userChoice + "\nComputer chose: " + computerChoice);
            System.out.println(chooseWinner(computerChoice, userChoice));
            end = true;
        }

    }


}
