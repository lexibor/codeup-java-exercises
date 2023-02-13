import java.sql.SQLOutput;
import java.util.Scanner;

public class HighLow
{
    public static void main(String[] args)
    {
        int rand = (int)(Math.random() * 100) + 1;

        System.out.print("Guess a number between 1-100: ");
        Scanner scanner = new Scanner(System.in);
        int userInt = Integer.parseInt(scanner.nextLine());

            System.out.println(highOrLow(userInt, rand));




    }

    static int count = 0;
    public static String highOrLow(int num, int rand)
    {
        count++;
        Scanner scanner = new Scanner(System.in);
            if(num > rand)
            {
                System.out.println();
                System.out.println("NUMBER OF GUESSES: " + count);
                System.out.print("LOWER: ");
                int userInt = Integer.parseInt(scanner.nextLine());
                return highOrLow(userInt, rand);
            }
            else if(num < rand)
            {
                System.out.println();
                System.out.println("NUMBER OF GUESSES: " + count);
                System.out.print("HIGHER: ");
                int userInt = Integer.parseInt(scanner.nextLine());
                return highOrLow(userInt, rand);
            }
            return "GUESSED THE NUMBER!";
    }

}
