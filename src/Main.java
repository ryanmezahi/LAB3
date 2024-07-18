public class Main {
    public static void main(String[] args) {

        Order order = new Order("123");


        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();
        order.addObserver(priceObserver);
        order.addObserver(quantityObserver);


        System.out.println("Adding item with price 50");
        order.addItem(50);
        System.out.println(order);

        System.out.println("Adding item with price 100");
        order.addItem(100);
        System.out.println(order);

        System.out.println("Adding item with price 60");
        order.addItem(60);
        System.out.println(order);

        System.out.println("Adding item with price 20");
        order.addItem(20);
        System.out.println(order);

        System.out.println("Adding item with price 10");
        order.addItem(10);
        System.out.println(order);

        System.out.println("Adding item with price 5");
        order.addItem(5);
        System.out.println(order);
    }
}
