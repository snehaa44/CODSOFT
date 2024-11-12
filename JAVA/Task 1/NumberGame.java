import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxRange = 100;  
        int maxAttempts = 10; 
        int score = 0; 
        boolean playAgain;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts per round.");

        do {
            int randomNumber = random.nextInt(maxRange) + 1; 
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nNew Round! I've picked a number between 1 and " + maxRange + ".");
            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + randomNumber + ".");
            }

            System.out.println("Your current score (rounds won): " + score);

            // Ask if the user wants to play another round
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("\nThanks for playing! Your final score is " + score + " rounds won.");
        scanner.close();
    }
}
