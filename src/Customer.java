import java.util.ArrayList;
import java.util.List;

class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String newname) {
        this.name = newname;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public static String statement(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("Rental Record for ").append(customer.getName()).append("\n");
        resultBuilder.append("\t").append("Title").append("\t").append("\t").append("Days").append("\t").append("Amount").append("\n");


        for (Rental rental : customer.rentals) {
            double rental_result;

            //determine amounts for rental line
            rental_result = rental.getAmount();

            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                frequentRenterPoints++;

            //show figures for this rental
            resultBuilder.append("\t").append(rental.getMovie().getTitle()).append("\t").append("\t").append(rental.getDaysRented()).append("\t").append(rental_result).append("\n");
            totalAmount += rental_result;
        }

        //add footer lines
        resultBuilder.append("Amount owed is ").append(totalAmount).append("\n");
        resultBuilder.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return resultBuilder.toString();
    }

}
    