package org.example;

public class CoverMovie {
    private int idMovie;
    private String movieTitle;
    private String movieGenre;
    private String moviePicture;

    public CoverMovie(int idMovie, String movieTitle, String movieGenre, String moviePicture) {
        this.idMovie = idMovie;
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
        this.moviePicture = moviePicture;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public void setMoviePicture(String moviePicture) {
        this.moviePicture = moviePicture;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getMoviePicture() {
        return moviePicture;
    }
}
