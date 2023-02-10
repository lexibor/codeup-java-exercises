import java.util.Scanner;

public class ConsoleExercises
{
    public static void main(String[] args)
    {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f %n", pi);
//
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

////        System.out.print("Enter something: ");
////        int userInt = scanner.nextInt();
////        System.out.println("You entered \"" + userInt + "\"");
//
//        System.out.print("Enter three words: ");
//        String threeWords = scanner.nextLine();
//        System.out.println("Your three words are \"" + threeWords + "\"");

        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        double roomWidth = width;
        double roomLength = length;

        double roomArea = roomLength * roomWidth;
        double roomPer = (roomLength + roomWidth) * 2;

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        double roomHeight = height;

        double vol = roomArea * roomHeight;

//        System.out.println(roomArea);
//        System.out.println(roomPer);
        System.out.printf("The area of the room is %.2f and the perimeter is %.2f %n", roomArea, roomPer);
        System.out.printf("The volume of the room is: %.2f", vol);


    }
}
