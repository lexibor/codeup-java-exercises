package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

                movies = addMovie(movies, new Movie(userMovieName, userMovieCategory));

                for(Movie movie : movies)
                {
                    System.out.println(movie.getMovie() + " -- " + movie.getCategory());
                }

            }


            ///// FILTERING AND PRINTING OUT MOVIES /////
            Movie[] movieSearch = searchMoviesInCategory(returnCategory(userInput), movies);

            /////// PRINT OUT FILTERED MOVIES //////
            for(Movie movie : movieSearch)
            {
                System.out.println(movie.getMovie() + " -- " + movie.getCategory());
            }

            System.out.println("""
                    
                    """);
            System.out.println("Would you like to search another category/add another movie?");


        }while(input.yesNo());
    }


    public static Movie[] searchMoviesInCategory(String movieCategory, Movie[] movies)
    {
        ArrayList<Movie> filterMoviesList = new ArrayList<>();

        if(movieCategory.isEmpty())
        {
            return movies;
        }

        ///// FILTER THE MOVIES //////
        for(int i = 0; i < movies.length; i++)
        {
            if(movies[i].getCategory().equals(movieCategory))
            {
                filterMoviesList.add(movies[i]);
            }
        }
        Movie[] filteredMovies = new Movie[filterMoviesList.size()];
        for(int i = 0; i < filterMoviesList.size(); i++)
        {
            filteredMovies[i] = filterMoviesList.get(i);
        }

        return filteredMovies;

    }

    public static String returnCategory(int userNum)
    {
        return switch (userNum) {
            case 1 -> "";
            case 2 -> "animated";
            case 3 -> "drama";
            case 4 -> "horror";
            case 5 -> "scifi";
            case 6 -> "musical";
            default -> "";
        };
    }


    public static Movie[] addMovie(Movie[] movies, Movie movie)
    {
        Movie[] addedMovies = Arrays.copyOf(movies, movies.length + 1);

        addedMovies[addedMovies.length - 1] = movie;

        return addedMovies;
    }



}
