package org.example;

import java.util.ArrayList;
import java.util.List;

public class PosterManager {
    private List<CoverMovie> movies = new ArrayList<>();
    private int limit;

    public PosterManager() {
        this.limit = 5; // Устанавливаем лимит по умолчанию в 5
    }

    public PosterManager(int limit) {
        this.limit = limit; // Устанавливаем пользовательский лимит
    }

    public void addMovie(CoverMovie movie) {
        movies.add(movie);
    }

    public List<CoverMovie> findAll() {
        return new ArrayList<>(movies);
    }

    public List<CoverMovie> findLast() {
        int resultLength = Math.min(limit, movies.size());
        CoverMovie[] result = new CoverMovie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies.get(movies.size() - i - 1);
        }
        return List.of(result);
    }
}
