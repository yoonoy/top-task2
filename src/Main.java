class Book {

    private String title;
    private String author;
    private String ISBN;
    private int price;

    public Book(){
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.price = 1;
    }

    public Book(String title, String author, String ISBN, int price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: $" + price);
    }


    public void applyDiscount(double discount) {
        price -= price * (discount / 100);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        System.out.println();

        Book book2 = new Book("Harry Potter", "J.K. Rowling", "9780316769488", 20);
        book2.displayInfo();

        System.out.println();
        book2.applyDiscount(15);
        System.out.println("After applying a 15% discount:");
        book2.displayInfo();

        System.out.println();

        Book book3 = new Book("Idiot", "Fyodor Dostoevsky", "7843689237402", 18);
        book3.displayInfo();
    }
}

