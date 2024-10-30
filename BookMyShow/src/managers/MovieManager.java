package managers;

import models.City;
import models.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieManager {

    private Map<City, List<Movie>> cityVsMovie;
    private List<Movie> movies;

    public MovieManager() {
        this.cityVsMovie = new HashMap<>();
        this.movies = new ArrayList<>();
    }

    public void addMoveToCity(City city, Movie movie) {
        List<Movie> moviesScreenedInCity = cityVsMovie.getOrDefault(city, new ArrayList<>());
        moviesScreenedInCity.add(movie);
        cityVsMovie.put(city, moviesScreenedInCity);
    }

    public Movie getMovieByName(String movieName) throws Exception {
        for (Movie movie : movies) {
            if (movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }
        throw new Exception("Movie with name:" + " " + movieName + " not found");
    }

    public List<Movie> getMoviesByCity(City city) throws Exception {
        if (cityVsMovie.containsKey(city)) {
            return cityVsMovie.get(city);
        }

        throw new Exception("City does not exits");
    }

    public Map<City, List<Movie>> getCityVsMovie() {
        return this.cityVsMovie;
    }

    public List<Movie> movies() {
        return this.movies;
    }

}
