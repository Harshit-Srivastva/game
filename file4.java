import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int playerGuess;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound + ".");

        do {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }

        } while (playerGuess != numberToGuess);

        scanner.close();
    }
}
