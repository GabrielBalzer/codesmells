public class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

    public String getTitle() {
        return title;
    }

    double getAmount(int daysRented){
        if (daysRented > 2)
            return (daysRented - 2) * 1.5;
        return 2;
    }

}