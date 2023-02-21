package Media;

abstract class Media implements Interactions
{
    public void read()
    {
        System.out.println("Reading....");
    }

    public abstract void whatIsRead();

}
