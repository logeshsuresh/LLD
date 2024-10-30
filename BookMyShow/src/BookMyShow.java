import managers.BookingManager;
import managers.MovieManager;
import managers.PaymentManager;
import managers.TheatreManager;
import managers.UserManager;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {

    private UserManager userManager;
    private MovieManager movieManager;
    private TheatreManager theatreManager;
    private BookingManager bookingManager;
    private PaymentManager paymentManager;

    public BookMyShow() {
        this.userManager = new UserManager();
        this.movieManager = new MovieManager();
        this.theatreManager = new TheatreManager();
        this.paymentManager = new PaymentManager();
        this.bookingManager = new BookingManager(paymentManager);

        initializeTestData();
    }

    private void initializeTestData() {
        // Create dummy user
        User user1 = userManager.createUser("Logesh");

        // Create cities
        City chennai = new City("Chennai");
        City bangalore = new City("Bangalore");
        City kochi = new City("Kochi");

        // Create movies featuring Rajinikanth and Surya
        Movie movie1 = new Movie(1L, "Baasha", 180L); // Rajinikanth movie
        Movie movie2 = new Movie(2L, "Sivaji", 150L); // Rajinikanth movie
        Movie movie3 = new Movie(3L, "Singam", 160L); // Surya movie
        Movie movie4 = new Movie(4L, "24", 145L); // Surya movie

        // Add movies to cities
        movieManager.addMoveToCity(chennai, movie1);
        movieManager.addMoveToCity(chennai, movie2);
        movieManager.addMoveToCity(bangalore, movie3);
        movieManager.addMoveToCity(kochi, movie4);

        // Create theatres
        Theatre theatre1 = new Theatre(1L, "PVR Cinemas", chennai);
        Theatre theatre2 = new Theatre(2L, "Inox", bangalore);
        Theatre theatre3 = new Theatre(3L, "Cinepolis", kochi);

        // Add theatres to cities
        theatreManager.getCityVsTheatre().put(chennai, List.of(theatre1));
        theatreManager.getCityVsTheatre().put(bangalore, List.of(theatre2));
        theatreManager.getCityVsTheatre().put(kochi, List.of(theatre3));

        // Create shows
        Show show1 = new Show(1L, movie1, theatre1, System.currentTimeMillis(), System.currentTimeMillis() + 6000000);
        Show show2 = new Show(2L, movie2, theatre1, System.currentTimeMillis(), System.currentTimeMillis() + 7200000);
        Show show3 = new Show(3L, movie3, theatre2, System.currentTimeMillis(), System.currentTimeMillis() + 5400000);
        Show show4 = new Show(4L, movie4, theatre3, System.currentTimeMillis(), System.currentTimeMillis() + 5000000);

        // Add shows to theatres
        theatre1.getShows().add(show1);
        theatre1.getShows().add(show2);
        theatre2.getShows().add(show3);
        theatre3.getShows().add(show4);

        bookTicket(user1, show1, List.of(new Seat('A', 1, SeatType.REGULAR, 150.0)));
    }

    private void bookTicket(User user, Show show, List<Seat> seats) {
        // Reserve booking
        Booking booking = bookingManager.reserveBooking(show, user, seats);
        System.out.println("Booking reserved with ID: " + booking.getBookingId());

        // Make payment
        paymentManager.makePayment(booking);
        booking.setBookingStatus(BookingStatus.CONFIRMED);
        System.out.println("Payment made for Booking ID: " + booking.getBookingId());
        System.out.println("Booking status: " + booking.getBookingStatus());
    }

}
