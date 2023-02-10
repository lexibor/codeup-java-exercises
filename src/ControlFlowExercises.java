import java.util.Scanner;

public class ControlFlowExercises
{
    public static void main(String[] args)
    {
        ///// WHILE ////
//        int i = 5;
//
//        while(i <= 15)
//        {
//            System.out.print(i + " ");
//            i += 1;
//        }


        /////// DO-WHILE ///////

//        int i = 0;
//
//        do
//        {
//            System.out.println(i);
//            i += 2;
//        }
//        while(i <= 100);

//        int i = 100;
//        do
//        {
//            System.out.println(i);
//            i -= 5;
//
//        }while(i >= -10);
//
//        long i = 2;
//        do
//        {
//            System.out.println(i);
//            i *= i;
//
//        }while(i < 1000000);


        /// FOR LOOP /////

//        for(int i = 5; i <= 15; i += 1)
//        {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        for(long i = 2; i < 1000000; i *= i)
//        {
//            System.out.println(i);
//        }



        ////// FIZZ BUZZ //////

//        for(int i = 1; i <= 100; i++)
//        {
//            if(i % 3 == 0 && i % 5 == 0)
//            {
//                System.out.println("FizzBuzz");
//            }
//            else if(i % 5 == 0)
//            {
//                System.out.println("Buzz");
//            }
//            else if(i % 3 == 0)
//            {
//                System.out.println("Fizz");
//            }
//            else
//            {
//                System.out.println(i);
//            }
//        }


        //// TABLE OF POWERS /////

        Scanner scanner = new Scanner(System.in);
        boolean userIn = true;

        while(userIn)
        {

            System.out.print("What number would you like to go up to? ");
            int num = Integer.parseInt(scanner.nextLine());

            System.out.println("Here is your table!");

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for(int i = 1; i <= num; i++)
            {
                int iSq = (int) Math.pow(i, 2);
                int iCub = (int) Math.pow(i, 3);

                System.out.printf("%-7d|%-9d|%d%n",i, iSq, iCub);
            }

            System.out.println("Do you wish to stop entering numbers? (yes/no) ");
            String ans = scanner.nextLine();

            if(ans.equalsIgnoreCase("yes"))
            {
                userIn = false;
            }

        }

        //// LETTERED GRADE /////

//        System.out.print("What was your grade? ");
//        int grade = scanner.nextInt();
//
//        if(grade <= 100 && grade >= 88)
//        {
//            System.out.println("You got an: A");
//        }
//        else if(grade <= 87 && grade >= 80)
//        {
//            System.out.println("You got a: B");
//        }
//        else if(grade <= 79 && grade >= 67)
//        {
//            System.out.println("You got a: C");
//        }
//        else if(grade <= 66 && grade >= 60)
//        {
//            System.out.println("You got a: D");
//        }
//        else if(grade <= 59 && grade >= 0)
//        {
//            System.out.println("You got an: F :(");
//        }
//



        ////////// BONUSES ///////////

//        System.out.println("Enter your favorite quote: ");
//        String quote = scanner.nextLine();
//        System.out.print("How many words are in your quote? ");
//        int numOfWords = Integer.parseInt(scanner.nextLine());
//
//        String[] listOfWords = quote.split("\\s");
//
//        if(numOfWords == listOfWords.length)
//        {
//            System.out.println("You entered the correct number of words.");
//        }
//        else
//        {
//            System.out.printf("The number you entered is incorrect, there are actually %d words in the quote.", listOfWords.length);
//        }

//        System.out.print("Please enter your three favorite foods in one line: ");
//        String food1 = scanner.next();
//        String food2 = scanner.next();
//        String food3 = scanner.next();
//
//        System.out.printf("1. %s%n2. %s%n3. %s", food1, food2, food3);


//        Prompt the user to enter a grocery list of three items
//        - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//        - output the result as a comma-separated list using printf()



//        System.out.print("Enter a grocery list of 3 items separated by commas and no spaces: ");
//        String groceryList = scanner.nextLine();
//
//        Scanner list = new Scanner(groceryList);
//        list.useDelimiter(",");
//        String list1 = list.next();
//        String list2 = list.next();
//        String list3 = list.next();
//
//        System.out.printf("Your grocery list is:%n%s%n%s%n%s", list1, list2, list3);


    }

}
