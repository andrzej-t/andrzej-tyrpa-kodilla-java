package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {


    int totalRounds;
    boolean end = false;
    int currentRound;

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


    public String chooseWinner(String computerChoice, String userChoice) {
        String winner = "Nobody";
        String finalMessage;
        Scanner scanner = new Scanner(System.in);


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

        if (userChoice.equalsIgnoreCase("x")) {
            System.out.println("Are you sure you want to finish game? 1 - Yes    Any - No");
            String decision = scanner.nextLine();
            if (decision.equals("1")) {
                end = true;
            } else {
                start();
            }
        }

        if (userChoice.equalsIgnoreCase("n")) {
            System.out.println("Are you sure you want to restart game? 1 - Yes    Any - No");
            String decisionN = scanner.nextLine();
            if (decisionN.equals("1")) {
                start();
            } else {
                end = true;
            }

        }


        finalMessage = winner + " won this round!";
        return finalMessage;
    }


    private void setTotalRounds() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of rounds you want to play in order to win:");
        totalRounds = scanner.nextInt();
        System.out.println("You will play: " + totalRounds + " rounds.");
    }

    public void start() {
        String computerChoice;
        String userChoice;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        while (!end && currentRound <= totalRounds) {

            setTotalRounds();
            for (int i = 0; i<= totalRounds - 1; i++) {
                showMenu();
                computerChoice = generateComputerChoice(random);
                userChoice = getUserChoice(scanner);
                System.out.println("You chose: " + userChoice + "\nComputer chose: " + computerChoice);
                System.out.println(chooseWinner(computerChoice, userChoice));
            }
        end = true;

        }
    }
}
