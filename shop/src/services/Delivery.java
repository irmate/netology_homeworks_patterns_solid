package services;

public interface Delivery {
    public void send(Order order);

    public void trace(int orderNumber);
}