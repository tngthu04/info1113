import java.time.LocalDate;

public class Actor{
    private String name;
    private LocalDate dateOfBirth;
    private Movie[] movies;

    public Actor(String name, LocalDate birthDate, Movie[] movies){
        this.name = name;
        this.dateOfBirth = birthDate;
        this.movies = movies;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getBirthDate(){
        return this.dateOfBirth;
    }

    public Movie[] getMovies(){
        return this.movies;
    }
}
