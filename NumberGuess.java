import java.util.*;

class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("You have only 5 attempts!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Game Over! The number was: " + number);
        }

        sc.close();
    }
}
