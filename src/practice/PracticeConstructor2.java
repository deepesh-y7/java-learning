package practice;

class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with title, author and price
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("-------------------------");
    }
}

public class PracticeConstructor2 {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Meditations", "Marcus Aurelius");
        Book b3 = new Book("The Almanack of Naval Ravikant", "Naval Ravikant", 250.0);

        b1.display();
        b2.display();
        b3.display();
    }
}