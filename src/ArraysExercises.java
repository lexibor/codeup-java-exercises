public class ArraysExercises
{
    public static void main(String[] args)
    {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person p1 = new Person("Alexia");
        Person p2 = new Person("Emma");
        Person p3 = new Person("Denise");

        Person p4 = new Person("Giselle");


        Person[] people = {p1, p2, p3};

//        for(Person person : people)
//        {
//            System.out.println(person.getName());
//        }

        System.out.println(Person.getNames(people));


       Person[] newPeopleArr = Person.addPerson(people, p4);

        System.out.println("New array: " + Person.getNames(newPeopleArr));







    }
}
