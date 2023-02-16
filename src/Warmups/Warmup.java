package Warmups;

public class Warmup
{
    public static void main(String[] args)
    {
        /* TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
        Find the sum of all five double values using an enhanced for loop.
        */

//        double[] numbers = new double[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;

        double[] numbers = {1, 2, 3, 4, 5};

        double sum = 0;
        for(double number : numbers)
        {
            sum += number;
        }

        System.out.println(sum);

    }






}
