import java.time.LocalDate;

public class Movie{
    private String name;
    private Studio studio;
    private LocalDate releaseDate;
    private String genre;
    private Actor[] actors;

    public Movie(String name, Studio studio, LocalDate releaseDate, String genre, Actor[] actors){
        this.name = name;
        this.studio = studio;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.actors = actors;
    }

    public String getName(){
        return this.name;
    }
    public Studio getStudio(){
        return this.studio;
    }
    public LocalDate getReleaseDate(){
        return this.releaseDate;
    }
    public String getGenre(){
        return this.genre;
    }

    public Actor[] getActors(){
        return this.actors;
    }

    public String getStudioLocation(){
        return this.studio.getLocation();
    }

    public boolean copyrighted(){
        int afterRelease = LocalDate.now().getYear() - this.releaseDate.getYear();
        if (afterRelease > 75){
            return false;
        }
        return true;
    }
}
