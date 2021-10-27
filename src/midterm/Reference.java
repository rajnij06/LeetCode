package Assignment1;

public class Reference extends Book {
    String category = "dictionaries";

    public void Fiction(String title, double price, String publishYear, String category) {
        this.price=price;
        this.publishYear=publishYear;
        this.category=category;
    }
    Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }
    String disc() {
        return "World Maps "+this.title+" all information is real.";
    }
}