package Media;

public class MediaTest
{
    public static void main(String[] args)
    {
        Book book = new Book();
        Vinyl vinyl = new Vinyl();
        Person person = new Person();

        vinyl.read();
        vinyl.whatIsRead();
        vinyl.sound();
        System.out.println(vinyl.canBeBroken());

        System.out.println();

        book.read();
        book.whatIsRead();
        book.taste();
        book.smell();

        System.out.println();

        person.sound();
        System.out.println("A person can be broken? " + person.canBeBroken());
    }
}
