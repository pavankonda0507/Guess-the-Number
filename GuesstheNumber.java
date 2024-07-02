import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int rounds = 3;  
        int maxAttempts = 5;  
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!");
         
        for (int round = 1; round <= rounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("\nRound " + round);
            System.out.println("The number between 1 and 100.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations, you guessed the correct number.");
                    guessedCorrectly = true;
                    score += (maxAttempts - attempts + 1);  
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guessed number is lower than actual number.");
                } else {
                    System.out.println("Your guessed number is higher than actual number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you have run out of attempts. The actual number was: " + numberToGuess);
            }
        }

        System.out.println("\nGame Over! Your final score is: " + score);
        scanner.close();
    }
}
