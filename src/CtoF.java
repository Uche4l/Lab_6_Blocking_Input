import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double FTemp = 0;
        double CTemp = 0;
        String trash;

        do {
            System.out.print("Please input temperature to convert to F: ");
            if (in.hasNextDouble()) {

                CTemp = in.nextDouble();
                System.out.println(CTemp);
                done = true;
                FTemp = (CTemp * 9 / 5) + 32;

                System.out.println("your temperature in Fahrenheit is: " + FTemp);

            } else {
                trash = in.nextLine();
                System.out.println("please enter valid temperature, not " + trash);
            }
        }

while (!done);
    }
}