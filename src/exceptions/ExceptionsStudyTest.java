package exceptions;

public class ExceptionsStudyTest
{
    public static void main(String[] args)
    {
//        try
//        {
            ExceptionsStudy study  = new ExceptionsStudy();
//
//            System.out.println(Integer.parseInt(study.notAnInt));
//        }
//        catch (NumberFormatException nfx)
//        {
//            System.out.println("Got an exception: " + nfx);
//            nfx.printStackTrace();  // Prints normal error
//            nfx.getMessage();
//        }

        try
        {
            System.out.println(study.notAnInt.substring(0, 8));

            System.out.println(study.notAnInt.length());
        }
        catch(StringIndexOutOfBoundsException siob)
        {
            System.out.println(siob.getMessage());
        }


    }
}
