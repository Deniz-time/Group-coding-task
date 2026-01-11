import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String name;
    private List<Order> orders;

    public Cafe(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Customer customer, Order order) {
        if (order.isEmpty()) {
            System.out.println("Order placement failed: empty order");
            return;
        }
        orders.add(order);
        System.out.println("Order placed by " + customer.getName());
    }

    public void completeOrder(Order order) {
        order.complete();
        System.out.println("Order completed");
    }
}

