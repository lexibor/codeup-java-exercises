package Media;

public class Person implements Interactions
{

    @Override
    public void sound() {
        System.out.println("A person can sing, sometimes they shouldn't though");
    }

    @Override
    public void smell() {
        System.out.println("Flowers! Looks like the showered and put some perfume on");
    }

    @Override
    public void touch() {
        System.out.println("Personal space!");
    }

    @Override
    public void taste() {
        System.out.println("Maybe ask a cannibal what a person tastes like.....");
    }

    @Override
    public boolean canBeBroken()
    {
        return true;
    }
}
