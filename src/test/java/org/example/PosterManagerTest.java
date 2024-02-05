package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldFindAll() {
        PosterManager manager = new PosterManager();
        CoverMovie movie1 = new CoverMovie(1, "Фильм 1", "Жанр 1", "Картинка 1");
        CoverMovie movie2 = new CoverMovie(2, "Фильм 2", "Жанр 2", "Картинка 2");
        manager.addMovie(movie1);
        manager.addMovie(movie2);

        CoverMovie[] expectedMovies = {movie1, movie2};
        CoverMovie[] actualMovies = manager.findAll().toArray(new CoverMovie[0]);

        Assertions.assertArrayEquals(expectedMovies, actualMovies);
    }

    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager(3);
        CoverMovie movie1 = new CoverMovie(1, "Фильм 1", "Жанр 1", "Картинка 1");
        CoverMovie movie2 = new CoverMovie(2, "Фильм 2", "Жанр 2", "Картинка 2");
        CoverMovie movie3 = new CoverMovie(3, "Фильм 3", "Жанр 3", "Картинка 3");
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        CoverMovie[] expectedMovies = {movie1, movie2, movie3};
        CoverMovie[] actualMovies = manager.findAll().toArray(new CoverMovie[0]);

        Assertions.assertArrayEquals(expectedMovies, actualMovies);

        PosterManager limitedManager = new PosterManager(2);
        limitedManager.addMovie(movie1);
        limitedManager.addMovie(movie2);
        limitedManager.addMovie(movie3);

        Assertions.assertArrayEquals(expectedMovies, actualMovies);
    }
}
