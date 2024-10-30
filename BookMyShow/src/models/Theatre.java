package models;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private final Long theatreId;

    private String theatreName;

    private City city;

    private List<Show> shows;

    private List<Screen> screens;

    public Theatre(Long theatreId, String theatreName, City city) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.city = city;
        this.shows = new ArrayList<>();
        this.screens = new ArrayList<>();
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public void setLocation(City city) {
        this.city = city;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public Long getTheatreId() {
        return this.theatreId;
    }

    public String getTheatreName() {
        return this.theatreName;
    }

    public City getCity() {
        return this.city;
    }

    public List<Show> getShows() {
        return this.shows;
    }

    public List<Screen> getScreens() {
        return this.screens;
    }

}
