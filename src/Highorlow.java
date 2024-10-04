import java.util.Scanner;
import java.util.Random;
public class Highorlow
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int guess = 0;

        System.out.println("Think of a number between 1 and 10. Can you guess what it is?");

        do {
            System.out.print("Enter your number 1 to 10): ");
            while (!scanner.hasNextInt()) {  // Checks if input is an integer
                System.out.print("That's not a valid number: ");
                scanner.next(); // Clears invalid input
            }
            guess = scanner.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.println("Enter a valid number between 1 and 10.");
            }
        } while (guess < 1 || guess > 10);

        System.out.println("The random number was: " + randomNumber);

        if (guess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println(" Your guess is on the money.");
        }


    }
}