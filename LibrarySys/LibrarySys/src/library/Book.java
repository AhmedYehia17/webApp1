package library;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String address;
    private String status;
    private int qty;
    private double price;
    private int brwcopies;

    public Book(){};



    public Book(String name, String author, String publisher, String address, String status, int qty, double price, int brwcopies){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.status = status;
        this.qty = qty;
        this.price = price;
        this.brwcopies = brwcopies;
    }

    public String toString(){
        String text = "Book Name: " + name +
                "Book Author: " + author +
                "Book publisher: "+ publisher+
                "Book Address: "+ address+
                "Book quantity: "+ String.valueOf(qty)+
                "Book Price: "+ String.valueOf(price)+
                "Borrowing Copies: "+ String.valueOf(brwcopies);

        return text;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public int getBrwcopies() {
        return brwcopies;
    }

}
