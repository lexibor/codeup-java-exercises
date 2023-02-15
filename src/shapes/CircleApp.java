package shapes;

import util.Input;

public class CircleApp
{

    private static int count;

    public static int getCount()
    {
        return count++;
    }


    public static void main(String[] args)
    {
        Input input = new Input();

        do
        {
            System.out.print("Please enter a radius: ");
            double r = Double.parseDouble(input.getScanner().nextLine());
            Circle circle = new Circle(r);

            System.out.printf("The area of the circle is: %.2f%n",circle.getArea());
            System.out.printf("The circumference of the circle is: %.2f%n",circle.getCircumference());

            System.out.println("Would you like to make a new circle?");

            getCount();

        }while(input.yesNo());

        System.out.printf("Created %d circles", getCount());

    }
}
