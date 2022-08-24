import java.time.LocalDate;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Arrays;

public class MovieStore{
    private String name;
    private String location;
    private Map<Movie, Integer> movies;

    public MovieStore(String name, String location){
        this.name = name;
        this.location = location;
        this.movies = new HashMap<Movie, Integer>();
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public Map<Movie, Integer> getMovies(){
        return this.movies;
    }


    public void addMovie(Movie movie){
        int numCopy;
        if (movie != null){
            if (this.movies.containsKey(movie)){
                numCopy = this.movies.get(movie);
                this.movies.replace(movie, numCopy, numCopy + 1);
            }else {
                this.movies.put(movie, 1);
            }
        }
    }


    public boolean rentMovie(Movie movie){
        int numCopy;
        if (this.movies.containsKey(movie)){
            numCopy = this.movies.get(movie);
            if (numCopy > 0) {
                this.movies.replace(movie, numCopy, numCopy - 1);
                return true;
                
            } 
        }
        return false;
    }


    public ArrayList<Movie> getMoviesByGenre(String genre){
        ArrayList<Movie> tmp = new ArrayList<Movie>();
        for (Movie keys : this.movies.keySet()){
            if (keys.getGenre().equals(genre)){
                tmp.add(keys);
            }
        }
        return tmp;
    }

    public HashSet<Movie> getMoviesWithActors(Actor[] actors){
        HashSet<Movie> tmp = new HashSet<Movie>();
        

        for (Movie keys : this.movies.keySet()){
            if (Arrays.asList(keys.getActors()).containsAll(Arrays.asList(actors))){
                tmp.add(keys);
            }
        }
        return tmp;
                  
    }

    public Movie[] getMoviesByStudio (String studioName){
        Movie[] tmp = new Movie[this.movies.size()];
        int countRes = 0;
        Studio checkStudio;
        for (Movie keys: this.movies.keySet()) {
            checkStudio = keys.getStudio();
            if (checkStudio.getName().equals(studioName)){
                tmp[countRes++] = keys;
            }
        }

        Movie[] result = new Movie[countRes];
        for (int i = 0; i < countRes; i++){
            result[i] = tmp[i];
        }

        return result;
    }

    public LinkedList<Movie> getMoviesWithoutCopyright(){
        LinkedList<Movie> result = new LinkedList<Movie>();
        for (Movie keys: this.movies.keySet()) {
            if (!keys.copyrighted()){
                result.add(keys);
            }
        }
        return result;

    }
}

