public class Book extends Product{
    String author;

    public Book(){}

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public double getDiscount(){
        //discount by 20%
        return super.getPrice()*20/100;
    }

    //extra methods
    @Override
    public String Use() {
        return "The User Read the book";
    }

    @Override
    String productCategory() {
        return "Books";
    }

    @Override
    public String toString() {
        return "Book{"+super.toString() + " Author:" + author+'}' ;
    }
}
