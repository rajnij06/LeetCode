package Assignment1;

public class Fiction extends Book implements iBorrowable{
    private int borrowDay;
    private int returnDay;
    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }
    String disc() {
        return "Frankenstein "+this.title+" all events are imaginary and not based on real facts";
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
