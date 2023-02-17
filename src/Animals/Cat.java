package Animals;

public class Cat extends Animal
{
    private String typeOfCat;


    public String getTypeOfCat() {
        return typeOfCat;
    }

    public void setTypeOfCat(String typeOfCat) {
        this.typeOfCat = typeOfCat;
    }

    public Cat(int numberOfLegs, String preferredClimate, String typeOfCat)
    {
        super(numberOfLegs, preferredClimate);
        this.typeOfCat = typeOfCat;
    }



    public String getAnimalInfo()
    {
        return String.format("Legs: %s%nPreferred Climate: %s%nType of Cat: %s", getNumberOfLegs(), getPreferredClimate(), typeOfCat);
    }


}
