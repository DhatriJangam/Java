import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        
        int attempts = 0;
        boolean guessed = false;
        
        while (attempts < 10 && !guessed) {
            int guess = 0;
            try {
                guess = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                continue;
            }
            
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid Input");
                continue;
            }
            
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                guessed = true;
                System.out.printf("Congratulations! You guessed the number %d correctly in %d attempts.\n", secretNumber, attempts);
            }
        }
        
        if (!guessed) {
            System.out.println("Sorry! You lost the game.");
        }
    }
}
