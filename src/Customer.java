import java.util.ArrayList;
import java.util.List;

class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("Rental Record for ").append(this.getName()).append("\n");
        resultBuilder.append("\t").append("Title").append("\t").append("\t").append("Days").append("\t").append("Amount").append("\n");


        for (Rental rental : rentals) {
            //show figures for this rental
            resultBuilder.append("\t").append(rental.getMovie().getTitle()).append("\t").append("\t").append(rental.getDaysRented()).append("\t").append(rental.getAmount()).append("\n");
        }

        //add footer lines
        resultBuilder.append("Amount owed is ").append(totalAmount()).append("\n");
        resultBuilder.append("You earned ").append(getFrequentRenterPoints()).append(" frequent renter points");
        return resultBuilder.toString();
    }

    private int getFrequentRenterPoints() {
        int result = 0;
        for (Rental rental: rentals
             ) {
            result += rental.getFrequentRenterPoints();

        }
        return result;
    }

    private double totalAmount() {
        double result = 0;
        for (Rental rental: rentals
        ) {
            result += rental.getAmount();

        }
        return result;
    }

}
    