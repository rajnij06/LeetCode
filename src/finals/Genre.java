package finals;

import java.util.ArrayList;

public class Genre {
    String name;
    ArrayList<Movie> movies;

    public Genre(String name) {
        this.name=name;
        this.movies = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Movie> getMovie() {
        return movies;
    }
    public void setMovie(ArrayList<Movie> movie) {
        this.movies = movie;
    }
    public void addMovie(Movie movie){
        this.movies.add(movie);
    }
}
