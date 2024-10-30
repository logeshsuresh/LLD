package models;

import java.util.ArrayList;
import java.util.List;

public class Show {

    private final Long showId;

    private Movie movie;

    private Theatre theatre;

    private Long startTime;

    private Long endTime;

    private List<Seat> bookedSeats;

    public Show(Long showId, Movie movie, Theatre theatre, Long startTime, Long endTime) {
        this.showId = showId;
        this.movie = movie;
        this.theatre = theatre;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookedSeats = new ArrayList<>();
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Long getShowId() {
        return this.showId;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public Theatre getTheatre() {
        return this.theatre;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public List<Seat> getBookedSeats() {
        return this.bookedSeats;
    }

    public Long getEndTime() {
        return this.endTime;
    }

}
