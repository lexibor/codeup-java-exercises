package Animals;

public class AnimalTester
{
    public static void displayAnimalDetails(Animal animal)
    {
        System.out.println(animal.getAnimalInfo());
    }

    public static void main(String[] args)
    {
        Animal Cosmo = new Dog(4, "House", "Beagle");
        Animal Garfield = new Cat(4, "House", "Orange Tabby");
        Animal Nemo = new Fish(0, "Saltwater", "Clownfish");


        displayAnimalDetails(Cosmo);
        System.out.println();
        displayAnimalDetails(Garfield);
        System.out.println();
        displayAnimalDetails(Nemo);
    }

}
