package models;

import java.util.List;

public class Booking {

    private final String bookingId;

    private Show show;

    private User user;

    private List<Seat> bookedSeats;

    private BookingStatus bookingStatus;

    public Booking(Show show, User user, List<Seat> bookedSeats) {
        this.bookingId = show.getShowId() + "-" + show.getMovie().getMovieId() + "-" + user.getName() + "-" + user.hashCode() + bookedSeats.size();
        this.show = show;
        this.user = user;
        this.bookedSeats = bookedSeats;
        this.bookingStatus = BookingStatus.PENDING_PAYMENT;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getBookingId() {
        return this.bookingId;
    }

    public Show getShow() {
        return this.show;
    }

    public User getUser() {
        return this.user;
    }

    public List<Seat> getBookedSeats() {
        return this.bookedSeats;
    }

    public BookingStatus getBookingStatus() {
        return this.bookingStatus;
    }

}
