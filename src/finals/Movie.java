package finals;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Movie {
    String  title;
    Date releaseDate;
    String director;
    ArrayList<String> actors;

    public Movie(String title, Date releaseDate, String director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.actors = new ArrayList<>();
    }
    public void addActors(String actor){
        this.actors.add(actor);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public ArrayList<String> getActors() {
        return actors;
    }
    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }
}
