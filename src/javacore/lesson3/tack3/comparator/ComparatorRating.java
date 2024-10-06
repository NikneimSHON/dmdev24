package javacore.lesson3.tack3.comparator;

import javacore.lesson3.tack3.Film;

import java.util.Comparator;

public class ComparatorRating implements Comparator<Film> {

    @Override
    public int compare(Film f1, Film f2) {
        return Integer.compare(f2.getRating(), f1.getRating());
    }
}
