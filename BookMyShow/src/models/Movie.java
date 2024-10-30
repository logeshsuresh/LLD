package models;

public class Movie {

    private final Long movieId;

    private String movieName;

    private Long movieDuration;

    public Movie(Long movieId, String movieName, Long movieDuration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDuration(Long movieDuration) {
        this.movieDuration = movieDuration;
    }

    public Long getMovieId() {
        return this.movieId;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public Long getMovieDuration() {
        return this.movieDuration;
    }

}