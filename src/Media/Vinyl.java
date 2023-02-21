package Media;

public class Vinyl extends Media
{

    @Override
    public void whatIsRead()
    {
        System.out.println("The turn-table reads: Castle in the Sky Original Soundtrack, side A");
    }

    public static void main(String[] args)
    {
        Vinyl vinyl = new Vinyl();

        vinyl.read();
        vinyl.whatIsRead();
    }

    @Override
    public void sound()
    {
        System.out.println("When coupled with a turn-table it makes a good sound");
    }

    @Override
    public void smell()
    {
        System.out.println("Probably plastic-y");
    }

    @Override
    public void touch()
    {
        System.out.println("Feels kinda cool to the touch");
    }

    @Override
    public void taste()
    {
        System.out.println("....why are you licking a dusty vinyl?");
    }

    @Override
    public boolean canBeBroken()
    {
        return true;
    }
}

