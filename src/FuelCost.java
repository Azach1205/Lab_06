import java.util.Scanner;
public class FuelCost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsOfGas = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        double costPer100Miles = 0.0;
        double distance = 0.0;
        boolean validInput;

        //Input for gallons of gas
        do
        {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble())
            {
                gallonsOfGas = in.nextDouble();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.nextLine();
            }
        } while (!validInput);

        //Input for fuel efficiency
        do
        {
            System.out.print("Enter the fuel efficiency in mpg: ");
            if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.nextLine();
            }
        } while (!validInput);

        //Input for price per gallon
        do
        {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.nextLine();
            }
        } while (!validInput);

        // Calculate cost per 100 miles
        costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        // Calculate how far the car can go with the gas in the tank
        distance = gallonsOfGas * fuelEfficiency;

        // Print the results
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("The car can go " + distance + " miles with the gas in the tank.");
    }
}