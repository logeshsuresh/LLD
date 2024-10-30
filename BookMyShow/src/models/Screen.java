package models;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private final Long screenId;

    private ScreenType screenType;

    private List<Seat> seats;

    public Screen(Long screenId, ScreenType screenType) {
        this.screenId = screenId;
        this.screenType = screenType;
        this.seats = new ArrayList<>();
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Long getScreenId() {
        return this.screenId;
    }

    public ScreenType getScreenType() {
        return this.screenType;
    }

    public List<Seat> getSeats() {
        return this.seats;
    }


}
