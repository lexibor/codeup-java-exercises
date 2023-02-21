package Media;

public class Book extends Media
{

    @Override
    public void whatIsRead()
    {
        System.out.println("Book being read: The Lord Of The Rings: Fellowship of the Ring");
    }


    @Override
    public void sound()
    {
        System.out.println("The sound of a page being turned is heard...");
    }

    @Override
    public void smell()
    {
        System.out.println("It has a distinct \"Old Book\" smell");
    }

    @Override
    public void touch()
    {
        System.out.println("Fancy book! It has leather covers");
    }

    @Override
    public void taste()
    {
        System.out.println("Probably ink, I wouldn't go around licking books though");
    }

    @Override
    public boolean canBeBroken()
    {
        return true;
    }
}




/*
    ================================= INTERFACE MINI EXERCISE
    Consider the library scenerio from the previous mini-exercise.
    Consider the following abstract class: Person
    Person could be extended in these sub-types
      Librarian
      Archivist
      Patron
      Researcher
      etc.
    Between Media and Person, what are some common interfaces that may exist? In other words, what are some
     things that can be done with or done to both Media and Person? Yet another way of considering
     the relationship between these two ideas: in what ways can you interact with
    both a Person and form of Media in a library the same way?
    For each shared aspect/way to interface with/interact with, create an interface. Define methods (no implementation)
     that one could expect to do when interfacing with both a Person and a form of Media.
    BONUS: consider the abstract class LibraryFurniture. What are additional interfaces or previously created interfaces that may be implemented by a LibraryFurniture class?

 */
