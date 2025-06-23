import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean validWidth = false, validHeight = false;

        // width
        do
        {
            System.out.print("Enter rectangle width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                validWidth = true;
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validWidth);

        // height
        do
        {
            System.out.print("Enter rectangle height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                validHeight = true;
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validHeight);

        // Calculation
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

    }
}