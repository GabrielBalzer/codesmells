class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    static int getFrequentRenterPoints(Rental rental) {
        int frequentRenterPoints = 1;

        // add bonus for a two day new release rental
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double getAmount() {
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                if (getDaysRented() > 2)
                    return (getDaysRented() - 2) * 1.5;
                return 2;
            case Movie.NEW_RELEASE:
                return getDaysRented() * 3;
            case Movie.CHILDRENS:
                if (getDaysRented() > 3)
                    return (getDaysRented() - 3) * 1.5;
                return 1.5;

            default:
                return 0;
        }
    }
}