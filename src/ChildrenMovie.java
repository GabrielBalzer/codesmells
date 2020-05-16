public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title, int priceCode) {
        super(title);
    }

    @Override
    double getAmount(int daysRented){
        if (daysRented > 3)
            return (daysRented - 3) * 1.5;
        return 1.5;
    }

}
