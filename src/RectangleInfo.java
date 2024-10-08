import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean doneWidth = false;
        boolean doneHeight = false;

        do {
            System.out.print("Enter length of your rectangle: ");
            if (in.hasNextDouble()){
                height = in.nextDouble();
                in.nextLine();
                doneWidth = true;
            }
            else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid length");
            }
        } while(!doneWidth);



        do {
            System.out.print("Enter width of your rectangle: ");
            if (in.hasNextDouble()){
                width = in.nextDouble();
                doneHeight = true;
            }else{
                trash = in.nextLine();
                System.out.println(trash + " is not a valid width");

            }
        }while(!doneHeight);

        area = height * width;
        System.out.println("The area of the rectangle is " + area + "ft squared");
        perimeter = (2 * height) + (2 * width);
        System.out.println("The perimeter of the rectangle is " + perimeter + "ft");
        diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        System.out.println("The diagonal of the rectangle is " + diagonal + "ft");
    }
}
