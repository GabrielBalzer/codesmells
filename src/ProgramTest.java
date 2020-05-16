import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    public void test() {
        Customer customer = new Customer("Gabriel");
        Movie movie = new Movie("Transformers");
        Movie kidsmovie = new ChildrenMovie("Lion King");
        Movie newreleasemovie = new NewReleaseMovie("John Wick 4");

        Rental rental1 = new Rental(movie, 7);
        Rental rental2 = new Rental(kidsmovie, 12);
        Rental rental3 = new Rental(newreleasemovie, 25);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        String expected = "Rental Record for " + "Gabriel" + "\n" + "\t" + "Title" + "\t" +
                "\t" + "Days" + "\t" + "Amount" + "\n" + "\t" + "Transformers" + "\t" + "\t" +
                7 + "\t" + 7.5 + "\n" + "\t" + "Lion King" + "\t" + "\t" + 12 + "\t" + 13.5 + "\n" +
                "\t" + "John Wick 4" + "\t" + "\t" + 25 + "\t" + 75.0 + "\n" + "Amount owed is " +
                96.0 + "\n" + "You earned " + 4 + " frequent renter points";

        String statement = customer.statement();
        assertEquals(statement, expected);
    }


}