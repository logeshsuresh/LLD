package managers;

import models.Booking;
import models.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    List<Payment> payments;

    public PaymentManager() {
        this.payments = new ArrayList<>();
    }

    public void makePayment(Booking booking) {
        Payment payment = new Payment(booking);
        payments.add(payment);
        System.out.println("MAKING PAYMENT FOR BOOKING: " + " " + booking.getBookingId());
    }

}
