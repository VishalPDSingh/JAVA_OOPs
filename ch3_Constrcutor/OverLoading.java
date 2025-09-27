package ch3_Constrcutor;

class Book {
    private String title;
    private String author;
    private float price;

    public Book() {
        this.title = "First Flight";
        this.author = "MaxWell";
        this.price = 458.2f;
    }

    Book(String author) {
        this.author = author;
    }

    Book(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }
}

public class OverLoading {
    public static void main(String[] args) {

        Book b1 = new Book();
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());

        Book b2 = new Book("Smith");
        System.out.println(b2.getTitle());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getPrice());

        Book b3 = new Book();
        System.out.println(b3.getTitle());
        System.out.println(b3.getAuthor());
        System.out.println(b3.getPrice());
    }
}
