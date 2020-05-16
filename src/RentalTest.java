import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RentalTest {

    @Test
    void rentalTest() {
        Movie movie = new Movie("MyMovie");
        Rental rental = new Rental(movie, 25);

        assertEquals(rental.getDaysRented(), 25);

        assertEquals(rental.getMovie().getTitle(), "MyMovie");
    }

}