import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        int guess;
        boolean validGuess = false;

        do {
            System.out.print("Guess a number (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    validGuess = true;
                    System.out.println("Random number was: " + randomNum);
                    if (guess == randomNum)
                    {
                        System.out.println("On the money!");
                    }
                    else
                        if (guess > randomNum) {
                        System.out.println("Too high!");
                    }
                        else
                        {
                        System.out.println("Too low!");
                    }
                } else {
                    System.out.println("Number must be 1-10.");
                }
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validGuess);
    }
}