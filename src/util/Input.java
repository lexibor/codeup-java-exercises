package util;

import java.util.Objects;
import java.util.Scanner;

public class Input
{
    private Scanner scanner;


    public Input()
    {
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner()
    {
        return scanner;
    }


    public String getString()
    {
        String in = scanner.nextLine();
        return in;
    }

    public boolean yesNo()
    {
        System.out.print("Input yes or no (y/n): ");
        String in = getString().toLowerCase();

        if(in.equals("no") || in.equals("n"))
        {
            return false;
        }
        return true;
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);

        int userIn = 0;
        try
        {
            userIn = Integer.parseInt(getString());
        }
        catch (NumberFormatException nfx)
        {
            System.out.println(nfx);
        }

        if (userIn <= min || userIn >= max) {
            System.out.printf("Number not within range. ");
            return getInt(min, max);
        }

        return userIn;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a decimal number between %.2f and %.2f: ", min, max);

        double userIn = 0;
        try
        {
            userIn = Double.parseDouble(getString());
        }
        catch (NumberFormatException nfx)
        {
            System.out.println(nfx.getMessage());
        }

        if (userIn <= min || userIn >= max) {
            System.out.printf("Decimal number not within range. ");
            return getDouble(min, max);
        }

        return userIn;
    }

}
