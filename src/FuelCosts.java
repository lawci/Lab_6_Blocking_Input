import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        boolean validGallons = false, validMpg = false, validPrice = false;

        // Input gallons
        do
        {
            System.out.print("Enter gallons of gas in tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                validGallons = true;
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validGallons);

        // Input MPG
        do {
            System.out.print("Enter fuel efficiency (MPG): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                validMpg = true;
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validMpg);

        // Input price of gas per gallon
        do {
            System.out.print("Enter price per gallon: $");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                validPrice = true;
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validPrice);

        // Calculations
        double cost100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;
        System.out.println("Cost to drive 100 miles: $" + cost100Miles);
        System.out.println("Distance with full tank: " + maxDistance + "miles" );
    }
}