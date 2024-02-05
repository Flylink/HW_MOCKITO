package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    private PosterManager manager;

    @BeforeEach
    public void setupLimit() {
        manager = new PosterManager(5);
    }

    @Test
    public void shouldAddMovie() {
        CoverMovie movie1 = new CoverMovie(1, "Фильм 1", "Жанр 1", "Картинка 1");
        CoverMovie movie2 = new CoverMovie(2, "Фильм 2", "Жанр 2", "Картинка 2");
        CoverMovie movie3 = new CoverMovie(3, "Фильм 3", "Жанр 3", "Картинка 3");

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        CoverMovie[] movies = manager.findAll();
        CoverMovie[] expectedMovies = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expectedMovies, movies);
        Assertions.assertEquals(movie1, movies[0]);
        Assertions.assertEquals(movie2, movies[1]);
        Assertions.assertEquals(movie3, movies[2]);
    }

    @Test
    public void shouldFindAll() {
        CoverMovie movie1 = new CoverMovie(1, "Фильм 1", "Жанр 1", "Картинка 1");
        CoverMovie movie2 = new CoverMovie(2, "Фильм 2", "Жанр 2", "Картинка 2");
        CoverMovie movie3 = new CoverMovie(3, "Фильм 3", "Жанр 3", "Картинка 3");
        CoverMovie movie4 = new CoverMovie(4, "Фильм 4", "Жанр 4", "Картинка 4");
        CoverMovie movie5 = new CoverMovie(5, "Фильм 5", "Жанр 5", "Картинка 5");
        CoverMovie movie6 = new CoverMovie(6, "Фильм 6", "Жанр 6", "Картинка 6");
        CoverMovie movie7 = new CoverMovie(7, "Фильм 7", "Жанр 7", "Картинка 7");
        CoverMovie movie8 = new CoverMovie(8, "Фильм 8", "Жанр 8", "Картинка 8");

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);

        CoverMovie[] movies = manager.findAll();
        CoverMovie[] expectedMovies = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8};
        Assertions.assertArrayEquals(expectedMovies, movies);
    }

    @Test
    public void shouldFindLast() {
        CoverMovie movie1 = new CoverMovie(1, "Фильм 1", "Жанр 1", "Картинка 1");
        CoverMovie movie2 = new CoverMovie(2, "Фильм 2", "Жанр 2", "Картинка 2");
        CoverMovie movie3 = new CoverMovie(3, "Фильм 3", "Жанр 3", "Картинка 3");
        CoverMovie movie4 = new CoverMovie(4, "Фильм 4", "Жанр 4", "Картинка 4");
        CoverMovie movie5 = new CoverMovie(5, "Фильм 5", "Жанр 5", "Картинка 5");
        CoverMovie movie6 = new CoverMovie(6, "Фильм 6", "Жанр 6", "Картинка 6");
        CoverMovie movie7 = new CoverMovie(7, "Фильм 7", "Жанр 7", "Картинка 7");
        CoverMovie movie8 = new CoverMovie(8, "Фильм 8", "Жанр 8", "Картинка 8");

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);

        CoverMovie[] lastMovies = manager.findLast();
        CoverMovie[] expectedMovies = {movie8, movie7, movie6, movie5, movie4};
        Assertions.assertArrayEquals(expectedMovies, lastMovies);
    }

    @Test
    public void shouldFindLastWithLimitLessThanMoviesLength() {
        CoverMovie movie1 = new CoverMovie(1, "Фильм 1", "Жанр 1", "Картинка 1");
        CoverMovie movie2 = new CoverMovie(2, "Фильм 2", "Жанр 2", "Картинка 2");
        CoverMovie movie3 = new CoverMovie(3, "Фильм 3", "Жанр 3", "Картинка 3");
        CoverMovie movie4 = new CoverMovie(4, "Фильм 4", "Жанр 4", "Картинка 4");
        CoverMovie movie5 = new CoverMovie(5, "Фильм 5", "Жанр 5", "Картинка 5");
        CoverMovie movie6 = new CoverMovie(6, "Фильм 6", "Жанр 6", "Картинка 6");
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        CoverMovie[] lastMovies = manager.findLast();
        CoverMovie[] expectedMovies = {movie6, movie5, movie4, movie3, movie2};
        Assertions.assertEquals(5, lastMovies.length);
        Assertions.assertArrayEquals(expectedMovies, lastMovies);
    }

    @Test
    public void shouldFindLastWithLimitGreaterThanMoviesLength() {
        CoverMovie movie1 = new CoverMovie(1, "Фильм 1", "Жанр 1", "Картинка 1");
        CoverMovie movie2 = new CoverMovie(2, "Фильм 2", "Жанр 2", "Картинка 2");
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        CoverMovie[] lastMovies = manager.findLast();
        CoverMovie[] expectedMovies = {movie2, movie1};
        Assertions.assertEquals(2, lastMovies.length);
        Assertions.assertArrayEquals(expectedMovies, lastMovies);
    }
}