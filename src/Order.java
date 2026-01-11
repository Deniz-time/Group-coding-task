import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<MenuItem> items;
    private boolean completed;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.completed = false;
    }

    public void addItem(MenuItem item) {
        if (completed) {
            System.out.println("Cannot add items to completed order");
            return;
        }
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void complete() {
        if (isEmpty()) {
            throw new IllegalStateException("Order cannot be empty");
        }
        completed = true;
    }
}
