package Media;

public class Book extends Media
{

    @Override
    public void whatIsRead()
    {
        System.out.println("The Lord Of The Rings: Fellowship of the Ring");
    }

    public static void main(String[] args)
    {
        Book book = new Book();

        book.read();
        book.whatIsRead();
    }

}
