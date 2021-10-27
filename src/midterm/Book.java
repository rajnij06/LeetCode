package Assignment1;

public abstract class Book {
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public String getPublishYear() {
        return publishYear;
    }
    String title;
    double price;
    String publishYear;

    public Book(String title, double price, String publishYear) {
        this.title=title;
        this.price=price;
        this.publishYear=publishYear;
    }
    abstract String disc();
}