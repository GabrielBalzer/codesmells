import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void customerTest() {
        Customer customer = new Customer("Name");

        assertEquals(customer.getName(), "Name");
    }


}