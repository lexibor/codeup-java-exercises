package movies;

import util.Input;

public class MoviesApplication
{
    public static void main(String[] args)
    {

        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        do
        {
            System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category 
                6 - view movies in the musical category
                7 - add a movie to the list
                
                """);
            System.out.print("Enter your choice: ");
            int userInput = Integer.parseInt(input.getScanner().nextLine());
            System.out.print(userInput);
            System.out.println();

            ////// MORE FUNCTIONALITY //////
            if(userInput == 0)
            {
                break;
            }

            if(userInput == 7)
            {
                System.out.print("Please enter a movie name: ");
                String userMovieName = input.getScanner().nextLine();
                System.out.println();
                System.out.print("Please enter a category: ");
                String userMovieCategory = input.getScanner().nextLine();

                movies = Movie.addMovie(movies, new Movie(userMovieName, userMovieCategory));

                Movie.printMovies(movies);

            }

            ///// FILTERING AND PRINTING OUT MOVIES /////
            Movie[] movieSearch = Movie.filterMoviesInCategory(Movie.returnCategory(userInput), movies);

            /////// PRINT OUT FILTERED MOVIES //////
            Movie.printMovies(movieSearch);

            System.out.println("""
                    
                    """);
            System.out.println("Would you like to search another category/add another movie?");


        }while(input.yesNo());
    }




}
