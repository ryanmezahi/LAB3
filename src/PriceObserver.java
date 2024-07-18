public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double discount = 20;
            order.setTotalPrice(order.getTotalPrice() - discount);
            System.out.println("PriceObserver: Discount applied. New total price: " + order.getTotalPrice());
        }
    }
}
