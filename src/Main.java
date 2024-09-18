class Book {
    String title;
    String author;
    String ISBN;
    int price;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "Harry Potter";
        book.author = "JK Rowling";
        book.ISBN = "6748392";
        book.price = 2000;  // Correcting price to be an integer

        // Displaying the book information
        book.displayInfo();
    }
}
