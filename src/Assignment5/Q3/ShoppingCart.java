package Assignment5.Q3;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeIterm(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentstrategy) {
        int amount = calculateTotal();
        paymentstrategy.pay(amount);
    }
}
