import java.time.LocalDate;

public class Studio {

    private String name;
    private String location;
    private Movie[] movies;

    public Studio(String name, String location, Movie[] movies){
        this.name = name;
        this.location = location;
        this.movies = movies;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public Movie[] getMovies(){
        return this.movies;
    }
}
