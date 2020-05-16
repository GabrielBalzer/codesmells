import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void customerTest() {
        Customer customer = new Customer("Name");

        assertEquals(customer.getName(), "Name");
    }


}