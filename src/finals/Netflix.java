package finals;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Netflix {
    String name;
    static ArrayList<Genre> genre;

    public Netflix(String name) {
        this.name = name;
        this.genre = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Genre> getGenre() {
        return genre;
    }
    public void setGenre(ArrayList<Genre> genre) {
        this.genre = genre;
    }
    public void setMovie(ArrayList<Genre> genre) {
        this.genre = genre;
    }
    public void addGenre(Genre genre) {
        this.genre.add(genre);
    }
    public static Genre getGenre(String genreName){
        ArrayList<Genre> filter = (ArrayList<Genre>) genre.stream()
                .filter(genre -> genre.getName().equalsIgnoreCase(genreName))
                .collect(Collectors.toList());
        if(filter.size() == 0){
            return null;
        }
        return filter.get(0);
    }
}
