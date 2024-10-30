package managers;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    List<Booking> bookings;

    private final PaymentManager paymentManager;

    public BookingManager(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
        this.bookings = new ArrayList<>();
    }

    public Booking reserveBooking(Show show, User user, List<Seat> bookedSeats) {
        Booking booking = new Booking(show, user, bookedSeats);
        this.bookings.add(booking);
        return booking;
    }

    public void confirmBooking(Booking booking) {
        paymentManager.makePayment(booking);
        booking.setBookingStatus(BookingStatus.CONFIRMED);
    }

    public void cancelBooking(Booking booking) {
        booking.setBookingStatus(BookingStatus.CANCELLED);
    }

}
