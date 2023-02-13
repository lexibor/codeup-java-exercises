import java.util.Scanner;

public class Bob
{
    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's talk to Bob! Say \"Goodbye Bob\" to stop takling to him.");

        boolean talking = true;
        while(talking)
        {

            String userIn = scanner.nextLine();

            if(userIn.endsWith("?"))
            {
                System.out.println("Bob: Sure");
            }
            else if(userIn.endsWith("!"))
            {
                System.out.println("Bob: Whoa, chill out!");
            }
            else  if(userIn.isEmpty())
            {
                System.out.println("Bob: Fine. Be that way!");
            }
            else if(userIn.equalsIgnoreCase("Goodbye Bob"))
            {
                System.out.println("Goodbye...");
                talking = false;
            }
            else
            {
                System.out.println("Bob: Whatever");

            }


        }








    }
}
