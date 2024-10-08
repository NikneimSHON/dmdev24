package javacore.lesson3.tack3;

import javacore.lesson3.tack3.comparator.ComparatorRating;
import javacore.lesson3.tack3.enumfile.Genre;
import javacore.lesson3.tack3.enumfile.Month;

import java.util.*;

public class Cinema {
    private final LinkedHashMap<Integer, LinkedHashSet<Film>> films;


    public Cinema() {
        films = new LinkedHashMap<>();
    }

    private Set<Integer> getAllId() {
        Set<Integer> id = new HashSet<>();
        for (Integer year : films.keySet()) {
            for (Film film : films.get(year)) {
                id.add(film.getId());
            }
        }
        return id;
    }

    public void addFilm(Film film) {
        Integer filmId = film.getId();
        if (getAllId().contains(filmId)) {
            System.out.println("Фильм с ID " + filmId + " уже существует. Добавление отменено.");
            return;
        }
        int year = film.getYear();
        films.putIfAbsent(year, new LinkedHashSet<>());
        films.get(year).add(film);
    }

    public LinkedHashSet<Film> getFilms(int year) {
        return films.getOrDefault(year, new LinkedHashSet<>());
    }

    public List<Film> getFilms(int year, Month Month) {
        List<Film> filmList = new ArrayList<>();

        LinkedHashSet<Film> movies = films.getOrDefault(year, new LinkedHashSet<>());
        for (Film film : movies) {
            if (film.getMonth().equals(Month)) {
                filmList.add(film);
            }
        }
        return filmList;
    }

    public List<Film> getFilms(Genre genre) {
        List<Film> filmList = new ArrayList<>();

        for (Map.Entry<Integer, LinkedHashSet<Film>> entry : films.entrySet()) {
            LinkedHashSet<Film> filmSet = entry.getValue();
            for (Film film : filmSet) {
                if (film.getGenre().equals(genre)) {
                    filmList.add(film);
                }
            }
        }
        return filmList;
    }

    public List<Film> getTopFilms() {
        List<Film> filmList = new ArrayList<>();
        for (Integer year : films.keySet()) {
            filmList.addAll(films.get(year));
        }
        filmList.sort(new ComparatorRating());
        return filmList.subList(0, (filmList.size()%10));

    }

    @Override
    public String toString() {
        return films.toString();
    }

}
