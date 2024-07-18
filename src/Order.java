import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private int itemCount;
    private double itemCost;
    private double totalPrice;
    private double shippingCost;
    private List<OrderObserver> observers;


    public Order(String id) {
        this.id = id;
        this.itemCount = 0;
        this.itemCost = 0.0;
        this.totalPrice = 0.0;
        this.shippingCost = 10.0;
        this.observers = new ArrayList<>();
    }


    public void addItem(double price) {
        this.itemCount++;
        this.itemCost += price;
        this.totalPrice += price;
        notifyObservers();
    }


    public void addObserver(OrderObserver observer) {
        this.observers.add(observer);
    }


    public void removeObserver(OrderObserver observer) {
        this.observers.remove(observer);
    }


    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
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

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCount=" + itemCount +
                ", itemCost=" + itemCost +
                ", totalPrice=" + totalPrice +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
