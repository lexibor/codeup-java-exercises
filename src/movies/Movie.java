package movies;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie
{
    private String movie;
    private String category;

    public Movie(String movie, String category)
    {
        this.movie = movie;
        this.category = category;
    }

    public String getMovie()
    {
        return movie;
    }

    public void setMovie(String movie)
    {
        this.movie = movie;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }


////// ALL STATIC METHODS //////

    public static Movie[] filterMoviesInCategory(String movieCategory, Movie[] movies)
    {
        ArrayList<Movie> filterMoviesList = new ArrayList<>();


        //////// NO INPUT / EMPTY ARRAY ////////
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

    /////// returnCategory AND filterMoviesCategory WORK HAND IN HAND ////////

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

    public static void printMovies(Movie[] movies)
    {
        for(Movie movie : movies)
        {
            System.out.println(movie.getMovie() + " -- " + movie.getCategory());
        }
    }

}
