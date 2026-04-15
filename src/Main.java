//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Book book1 = new Book("Clean Code",  500,"Robert Martin");
    Book book2 = new Book();
    //setter
    book2.setName("The Pragmatic Programmer");
    book2.setPrice(300);
    book2.setAuthor("Andrew Hunt");

    System.out.println("-----------Testing Book-----------");

    System.out.println("\n--Book1--");
    System.out.println(book1);
    System.out.println("--Book2--");
    System.out.println(book2);

    System.out.println("The discount by 20% for the book is ");
    System.out.println(book1.getDiscount());
    System.out.println("Final price:"+(book1.getPrice() - book1.getDiscount()));




    System.out.println("\n-----------Testing Movie-----------");
    Movie movie1 = new Movie("Inception",200 ,"Christopher Nolan");
    Movie movie2 = new Movie();
    //setter
    movie2.setName("The Matrix");
    movie2.setPrice(130);
    movie2.setDirector("Lana Wachowski");

    System.out.println("\n--Movie1--");
    System.out.println(movie1);
    System.out.println("--Movie2--");
    System.out.println(movie2);

    System.out.println("The discount by 50% for "+movie1.getName() +" movie is ");
    System.out.println(movie1.getDiscount());
    System.out.println("Final price:"+(movie1.getPrice() - movie1.getDiscount()));


    System.out.println("=======================Testing MovablePoint class=======================");

    MovablePoint point = new MovablePoint(10, 10, 3, 3);

    System.out.println("Starting position: (" + point.getX() + ", " + point.getY() + ")");

    point.moveUp();
    System.out.println("Moving Up:(" + point.getX() + ", " + point.getY() + ")");
    point.moveUp();
    System.out.println("Moving Up again:(" + point.getX() + ", " + point.getY() + ")");
    System.out.println("Setting ySpeed to 1");
    point.setySpeed(1);
    point.moveDown();
    System.out.println("Moving Down:(" + point.getX() + ", " + point.getY() + ")");

    point.moveLeft();
    System.out.println("Moving Left:(" + point.getX() + ", " + point.getY() + ")");

    point.moveRight();
    System.out.println("Moving Right:(" + point.getX() + ", " + point.getY() + ")");

    point.moveRight();
    System.out.println("Moving Right again:(" + point.getX() + ", " + point.getY() + ")");

}





