package Assignment1;

public class NonFiction extends Book implements iBorrowable{
    private int borrowDay;
    private int returnDay;
    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }
    String disc() {
        return "Anne Frank "+this.title+" all events are true and based on real facts.";
    }
    public void setBorrowDate(int day) {
        this.borrowDay=day;
    }
    public void setReturnDate(int day) {
        this.returnDay=day;
    }
    public boolean isAvailable(int day) {
        return false;
    }
}