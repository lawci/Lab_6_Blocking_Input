import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius;
        boolean validInput = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                validInput = true;
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a number.");
            }
        } while (!validInput);
    }
}
