package movies;

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
}
