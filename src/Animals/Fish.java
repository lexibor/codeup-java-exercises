package Animals;

public class Fish extends Animal
{
    private String typeOfFish;


    public String gettypeOfFish() {
        return typeOfFish;
    }

    public void settypeOfFish(String typeOfFish) {
        this.typeOfFish = typeOfFish;
    }

    public Fish(int numberOfLegs, String preferredClimate, String typeOfFish)
    {
        super(numberOfLegs, preferredClimate);
        this.typeOfFish = typeOfFish;
    }

    public String getAnimalInfo()
    {
        return String.format("Legs: %s%nPreferred Climate: %s%nType of Fish: %s", getNumberOfLegs(), getPreferredClimate(), typeOfFish);
    }
}
