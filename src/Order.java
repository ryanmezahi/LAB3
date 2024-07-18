public class Order {
    private String id;
    private int itemCount;
    private double itemCost;
    private double totalPrice;
    private double shippingCost;


    public Order(String id) {

    }


    public void addItem(double price) {

    }


    public void addObserver(OrderObserver observer) {

    }

    public void removeObserver(OrderObserver observer) {

    }


    private void notifyObservers() {

    }


    public String getId() {
        return id;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
