import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Guess My Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

        // Loop until the user guesses correctly
        while (userGuess != numberToGuess) {
            System.out.print("\nEnter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("\n🎉 Correct! You guessed the number " + numberToGuess + "!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
