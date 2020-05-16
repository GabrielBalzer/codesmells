import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    void movieTest1() {
        Movie movie = new Movie("MyMovie", 187);

        assertEquals(movie.getTitle(), "MyMovie");
        assertEquals(movie.getPriceCode(), 187);
    }

    @Test
    void movieTest2() {
        Movie movie = new Movie("MyMovie", 0);

        movie.setPriceCode(555);

        assertEquals(movie.getPriceCode(), 555);
    }

}