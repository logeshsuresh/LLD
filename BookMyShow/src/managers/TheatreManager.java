package managers;

import models.City;
import models.Movie;
import models.Show;
import models.Theatre;

import java.util.*;

public class TheatreManager {

    private Map<City, List<Theatre>> cityVsTheatre;

    private List<Theatre> theatres;

    public TheatreManager() {
        this.cityVsTheatre = new HashMap<>();
        this.theatres = new ArrayList<>();
    }

    public Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = cityVsTheatre.get(city);

        for(Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(Objects.equals(show.getMovie().getMovieId(), movie.getMovieId())) {
                    givenMovieShows.add(show);
                }
            }

            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }

    public Map<City, List<Theatre>> getCityVsTheatre() {
        return this.cityVsTheatre;
    }

    public List<Theatre> getTheatres() {
        return this.theatres;
    }

}
