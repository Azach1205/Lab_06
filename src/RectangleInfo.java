import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        boolean validInput;

        // Input for width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.nextLine();
            }
        } while (!validInput);

        // Input for height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.nextLine(); // Clear the invalid input
            }
        } while (!validInput);

        // Calculate area and perimeter of the rectangle
        area = width * height;
        perimeter = 2 * (width + height);

        // Calculate the length of the diagonal using the Pythagorean theorem
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Print the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}