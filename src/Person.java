import java.util.Arrays;

public class Person
{
    private static Person[] people;
    private static Person person;
    private String name;




    public Person(){}

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void sayHello()
    {
        System.out.printf("Hello, %s!%n", name);
    }



    public static Person[] addPerson(Person[] people, Person person)
    {
        Person[] morePeople = Arrays.copyOf(people, people.length + 1);

        morePeople[morePeople.length - 1] = person;

        return morePeople;
    }

    public static String getNames(Person[] people)
    {
        String names = "";
        for(Person person : people)
        {
            names += person.getName() + " ";
        }

        return names;
    }


//    public static void main(String[] args)
//    {
////        Person person = new Person("Alexia");
////
////        System.out.println(person.getName());
////        person.sayHello();
////        person.setName("Emma");
////        System.out.println(person.getName());
////        person.sayHello();
//
////        Person person1 = new Person("John");
////        Person person2 = new Person("John");
////        System.out.println(person1.getName().equals(person2.getName()));
////        System.out.println(person1 == person2);
//
////        Person person1 = new Person("John");
////        Person person2 = person1;
////        System.out.println(person1.getName());
////        System.out.println(person2.getName());
////        person2.setName("Jane");
////        System.out.println(person1.getName());
////        System.out.println(person2.getName());
//
//
//
//    }

}
