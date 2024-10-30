package models;

public class Payment {

    private final String paymentId;

    Booking booking;

    public Payment(Booking booking) {
        this.paymentId = booking.hashCode() + booking.getBookingId() + "-" + booking + "-" + booking.getUser().hashCode();
        this.booking = booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public Booking getBooking() {
        return this.booking;
    }

}
