package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {


    int totalRounds;
    boolean end = false;
    String winner = "Nobody";


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
        System.out.println("\nYou can choose:  1 - Rock   2 - Paper   3 - Scissors  n - Restart Game x - Exit");
    }

    public static String getUserChoice(Scanner scanner) {

            String userWordChoice;
            System.out.println("\nPlease, make your choice: ");
            userWordChoice = scanner.nextLine();

        switch (userWordChoice) {
            case "1":
                userWordChoice = "Rock";
                break;
            case "2":
                userWordChoice = "Paper";
                break;
            case "3":
                userWordChoice = "Scissors";
                break;
        }
            return userWordChoice;
        }

    public String chooseWinner(String computerChoice, String userChoice) {

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

            if (computerChoice.equalsIgnoreCase(userChoice)) {
                winner = "Nobody";
            }

        if (userChoice.equalsIgnoreCase("x")) {
            System.out.println("Are you sure you want to finish game? 1 - Yes    Any - No");
            String decision = scanner.nextLine();
            if (decision.equals("1")) {
                System.out.println("\n----------- END -----------");
                end = true;
            } else {
                start();
            }
        }

        if (userChoice.equalsIgnoreCase("n")) {
            System.out.println("Are you sure you want to restart game? 1 - Restart game    Any - Finish game");
            String decisionN = scanner.nextLine();
            if (decisionN.equals("1")) {
                start();
            } else {
                end = true;
                System.out.println("\n----------- END -----------");
            }

        }
            finalMessage = winner + " won this round!";
            return finalMessage;
        }

    private void setTotalRounds() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of rounds you want to win in order to finish game:");
        totalRounds = scanner.nextInt();
        System.out.println("You must win: " + totalRounds + " rounds.");
    }

    public void start() {
        String computerChoice;
        String userChoice;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWELCOME IN MY ROCK, PAPER, SCISSORS GAME!!!");
        while (!end) {

            int computerWon = 0;
            int draw = 0;
            int youWon=0;
            setTotalRounds();

            while (!end) {
                showMenu();
                computerChoice = generateComputerChoice(random);
                userChoice = getUserChoice(scanner);
                System.out.println("You chose: " + userChoice + "\nComputer chose: " + computerChoice);
                System.out.println(chooseWinner(computerChoice, userChoice));

                    System.out.println("You won: ");
                    for (int k = 0; k <= 0; k++) {
                        if (winner.equals("You")) {
                            youWon = youWon + 1;
                        }
                    }
                    System.out.println(youWon);

                    System.out.println("Computer won: ");
                    for (int k = 0; k <= 0; k++) {
                        if (winner.equals("Computer")) {
                            computerWon = computerWon + 1;
                        }
                    }
                    System.out.println(computerWon);

                    System.out.println("Draw: ");
                    for (int k = 0; k <= 0; k++) {
                        if (winner.equals("Nobody")) {
                            draw = draw + 1;
                        }
                    }

                System.out.println(draw);
            if (youWon==totalRounds) {

                end=true;}

           }
            if (youWon==totalRounds) {
                System.out.println("Congratulations, You won the game!!! ");
                System.out.println("\n----------- END -----------");
                end=true;
            }

        }

    }
}
