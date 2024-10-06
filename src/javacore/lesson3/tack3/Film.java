package javacore.lesson3.tack3;

import javacore.lesson3.tack3.enumfile.Genre;
import javacore.lesson3.tack3.enumfile.Month;

public class Film{
    private final Integer id;
    private final Integer year;
    private final Month month;
    private final Genre genre;
    private final Integer rating;

    public Film(Integer id, Integer year, Month month, Genre genre, Integer rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public Genre getGenre() {
        return genre;
    }

    public Integer getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Film) {
            Film movie = (Film) object;
            return this.id == movie.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}
