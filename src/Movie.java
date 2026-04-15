public class Movie extends Product{
    String director;

    public Movie(){}

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }


    public String getDirector() {
        return director;
    }


    public void setDirector(String director) {
        this.director = director;
    }


    public double getDiscount(){
        //discount by 50%
        return super.getPrice()*50/100;
    }

    //extra methods
    @Override
    public String Use() {
        return "The User watch the movie";
    }

    @Override
    String productCategory() {
        return "Movies";
    }

    @Override
    public String toString() {
        return "Movie{"+super.toString() +" director='" + director +'}';
    }
}
