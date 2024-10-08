package javacore.lesson3.tack3;

import javacore.lesson3.tack3.enumfile.Genre;
import javacore.lesson3.tack3.enumfile.Month;

/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив, где ключом является год издания,
 * а значением - все фильмы, выпустившиеся в этом году.
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
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
