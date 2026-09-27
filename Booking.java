import java.util.List;

public class Booking {
    private static int counter = 1000;private intbookingId;
    private Customer customer;
    private Movie movie;
    private List<Seat> seat;
    private double totalPrice;
    private boolean cancelled;

    public Booking(Customer customer, Movie movie, List<Seat> seat) {
        this.bookingId = ++counter;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.cancelled = false;
        this.totalPrice = calculatetotal();
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBookingId() {
            return bookingId;
}
