package javacore.lesson3.tack3;

import javacore.lesson3.tack3.enumfile.Genre;
import javacore.lesson3.tack3.enumfile.Month;

public class CinemaDemo {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        System.out.println(cinema.getFilms(1994));
        System.out.println(cinema.getFilms(1999,Month.APRIL));
        System.out.println(cinema.getFilms(Genre.FANTASY));
        System.out.println(cinema.getTopFilms());

        Film film1 = new Film(10,1999, Month.APRIL, Genre.MYSTERY,10);
        Film film2 = new Film(13,1994, Month.AUGUST, Genre.FANTASY,3);
        Film film3 = new Film(15,1994, Month.SEPTEMBER, Genre.BIOGRAPHY,144);
        Film film4 = new Film(15,1992, Month.AUGUST, Genre.FANTASY,159);
        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film3);
        cinema.addFilm(film4);

        System.out.println(cinema.getFilms(1994));
        System.out.println(cinema.getFilms(1999,Month.APRIL));
        System.out.println(cinema.getFilms(Genre.FANTASY));
        System.out.println(cinema.getTopFilms());


    }
}
