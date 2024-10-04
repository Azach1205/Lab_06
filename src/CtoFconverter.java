import java.util.Scanner;
public class CtoFconverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        String continueYN = "";
        String trash = "";
        boolean validInput;
        do
        {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                validInput = true;
                in.nextLine();

                //Convert Celsius to Fahrenheit
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
            } else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.nextLine();
            }
        }while (!validInput);
    }
}

