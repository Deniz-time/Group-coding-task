public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe("Coffee House");

        Customer customer = new Customer("John");

        MenuItem coffee = new MenuItem("Coffee", 3.5);
        MenuItem cake = new MenuItem("Cake", 4.0);
        MenuItem sandwich = new MenuItem("Sandwich", 5.5);

        Order order = customer.createOrder();
        order.addItem(coffee);
        order.addItem(cake);
        order.addItem(sandwich);

        cafe.placeOrder(customer, order);
        cafe.completeOrder(order);

        System.out.println("\nOrder items:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        System.out.println("Total price: $" + order.getTotalPrice());
    }
}

