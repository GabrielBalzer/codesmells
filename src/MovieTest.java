import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    void movieTest1() {
        Movie movie = new Movie("MyMovie");

        assertEquals(movie.getTitle(), "MyMovie");
    }

    @Test
    void movieTest2() {
        Movie movie = new Movie("MyMovie");

    }

}