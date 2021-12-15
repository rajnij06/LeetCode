package finals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.IntPredicate;

public class MainNetflix {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("Netflix1");
        netflix.setGenre(generateGenre());
        Genre genre1 = Netflix.getGenre("Genre1");
        addGenre1Movie(genre1);
        Genre genre2 = netflix.getGenre("Genre2");
        addGenre2Movie(genre2);
//        Printing all values
        netflix.genre.stream().flatMap(genre -> genre.getMovie().stream())
                .forEach(movie -> System.out.println(movie.title + " Director:" + movie.director+ " Date:" + movie.releaseDate));
        System.out.println("--------------------------------");

//        For all movies released before 2000, add the string "(Classic)" to the title of the movie using flatMap.
        netflix.genre.stream().flatMap(genre -> genre.getMovie().stream())
                .filter(movie -> movie.getReleaseDate().before(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime()))
                .forEach(movie -> System.out.println( movie.getTitle() + "(Classic)"));

//        Get the latest 3 movies released using .limit() method of stream.


//        Create a predicate for release date before 2000 and a predicate for release date before 1990 and then Chain the predicates for finding movies between 1990 and 2000.
        IntPredicate greaterThan1990 = i -> i > 1990;
        IntPredicate lessThan2000 = i -> i < 2000;
//        netflix.genre.stream().flatMap(genre -> genre.getMovie().stream())
//                .filter(greaterThan1990, )
//        Write a method which that will add release year in the title of the movie and return the title and then use this method for all the movies.


//        Sorting on one of the feature(Ex: Released year or title) which will use comparator.

    }

    private  static ArrayList<Genre> generateGenre(){
        Genre genre1 = new Genre("Genre1");
        Genre genre2 = new Genre("Genre2");
        ArrayList<Genre> list = new ArrayList<>();
        list.add(genre1);
        list.add(genre2);
        return list;
    }
    private static  void addGenre1Movie(Genre genre1) {
        Date date = new GregorianCalendar(1981, 6, 6).getTime();
        genre1.addMovie(new Movie("title1",date,"director1"));
        date = new GregorianCalendar(2001, 5, 12).getTime();
        genre1.addMovie(new Movie("title2",date,"director2"));
    }
    private static  void addGenre2Movie(Genre genre2) {
        GregorianCalendar date = new GregorianCalendar(1982, 7, 7);
        genre2.addMovie(new Movie("title3",date,"director3"));
        date = new GregorianCalendar(2002, 6, 13);
        genre2.addMovie(new Movie("title4",date,"director4"));
    }
}
