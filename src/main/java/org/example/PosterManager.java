package org.example;

public class PosterManager {
    private CoverMovie[] movies;
    private int limit;

    public PosterManager() {
        this.limit = 5; // Устанавливаем лимит по умолчанию в 5
        this.movies = new CoverMovie[0];
    }

    public PosterManager(int limit) {
        this.limit = limit; // Устанавливаем пользовательский лимит
        this.movies = new CoverMovie[0];
    }

    public void addMovie(CoverMovie movie) {
        CoverMovie[] updatedMovies = new CoverMovie[movies.length + 1];
        System.arraycopy(movies, 0, updatedMovies, 0, movies.length);
        updatedMovies[movies.length] = movie;
        movies = updatedMovies;
    }

    public CoverMovie[] findAll() {
        return movies;
    }

    public CoverMovie[] findLast() {
        int resultLength;
        if (limit <= movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        CoverMovie[] result = new CoverMovie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

