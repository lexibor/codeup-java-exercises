import java.util.Scanner;

public class MethodsExercises
{
    public static void main(String[] args)
    {
//        System.out.println(add(2, 2));
//        System.out.println(subtract(3, 1));
//        System.out.println(multiply(4, 3));
//        System.out.println(divide(10, 5));
//        System.out.println(modulus(9, 3));

        System.out.println(getInteger(5, 10));


        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1-10: ");
//        int userNum = scanner.nextInt();
//
//        System.out.printf("%d factorial is %d",userNum, factorial(userNum));


//        boolean rollAgain = true;
//        while(rollAgain)
//        {
//            System.out.print("Enter the number of sides for a pair of dice and press \"enter\" to roll: ");
//            int dice = Integer.parseInt(scanner.nextLine());
//            System.out.printf("The numbers you got were: %d and %d%n", diceRoll(dice), diceRoll(dice));
//
//            System.out.println("Do you wish to roll again? (y/n)");
//            String userAns = scanner.nextLine();
//
//            if(userAns.equalsIgnoreCase("n"))
//            {
//                rollAgain = false;
//            }
//
//        }


    }

    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2)
    {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2)
    {
        /////// :( /////////

        if(num2 == 0)
        {
//            System.out.println(num2);
//            System.out.println("done multiplying");
            return 0;
        }
        System.out.println(num2);

       return num1 + multiply(num1, num2 - 1);

    }

    public static double divide(double num1, double num2)
    {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2)
    {
        return num1 % num2;
    }

    public static int getInteger(int min, int max)
    {
        System.out.printf("Enter a number between %d and %d: ", min, max);

        Scanner scanner = new Scanner(System.in);

        int userIn = scanner.nextInt();

        if(userIn <= min || userIn >= max)
        {
            System.out.printf("Bad number. ");
            int userInput = getInteger(min, max);
            return userInput;
        }

        return userIn;
    }

    public static int factorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int diceRoll(int num)
    {
        int min = 1;
        int range = num - min + 1;
        int rand = (int)(Math.random() * range) + min;

        return rand;
    }




}
