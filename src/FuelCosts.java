import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        double capacity = 0;
        double MPG = 0;
        double PPG = 0;
        double amountOfGas = 0;
        double costOneHundredMiles;
        boolean doneInput = false;
        boolean doneCapacity = false;
        boolean doneMPG = false;
        boolean donePPG = false;
        String trash = "";
        Scanner input = new Scanner(System.in);



        System.out.print("Enter the price per gallon: ");
        PPG = input.nextDouble();

        do {
            System.out.print("Enter the amount of gallons your tank holds: ");
            if (input.hasNextDouble()) // OK safe to read in a double
            {
                capacity = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                doneCapacity = true; // we got a valid number so we can end the loop
            } else {
// Not a double so use nextLine() instead to read a String
                trash = input.nextLine();
                System.out.println("\nYou said your capacity was: " + trash);
                System.out.println("You have to enter a valid amount! ");
            }
        }while (!doneCapacity);

        do {
            System.out.print("Enter the MPG: ");
            if (input.hasNextDouble()) // OK safe to read in a double
            {
                MPG = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                doneMPG = true; // we got a valid number so we can end the loop
            }
            else
            {
// Not a double so use nextLine() instead to read a String
                trash = input.nextLine();
                System.out.println("\nYou said your MPG was: " + trash);
                System.out.println("You have to enter a valid amount! ");
            }
        }while (!doneMPG);


        do {
            System.out.print("Enter the PPG: ");
            if (input.hasNextDouble()) // OK safe to read in a double
            {
                PPG = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                donePPG = true; // we got a valid number so we can end the loop
            }
            else
            {
// Not a double so use nextLine() instead to read a String
                trash = input.nextLine();
                System.out.println("\nYou said your PPG was: " + trash);
                System.out.println("You have to enter a valid amount! ");
            }
        }while (!donePPG);

costOneHundredMiles = 100 * PPG;
capacity = MPG * amountOfGas;


        System.out.print("The cost for you to drive 100 miles is " + costOneHundredMiles + " miles per gallon.");

        System.out.println(" your vehicle is capable of driving " + capacity + " miles on a full tank of gas. " );


        }


}
