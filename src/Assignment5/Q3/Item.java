package Assignment5.Q3;

public class Item {
    private final String Id;
    private final int price;

    public Item(String id, int price) {
        this.Id = id;
        this.price = price;
    }
    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }
}
