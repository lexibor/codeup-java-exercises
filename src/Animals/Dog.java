package Animals;

public class Dog extends Animal
{
    private String typeOfDog;

    public String getTypeOfDog() {
        return typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
        this.typeOfDog = typeOfDog;
    }

    public Dog(int numberOfLegs, String preferredClimate, String typeOfDog)
    {
        super(numberOfLegs, preferredClimate);
        this.typeOfDog = typeOfDog;
    }


    public String getAnimalInfo()
    {
        return String.format("Legs: %s%nPreferred Climate: %s%nType of Dog: %s", getNumberOfLegs(), getPreferredClimate(), typeOfDog);
    }
}
