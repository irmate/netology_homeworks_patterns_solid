package services;

import resources.Products;

import java.util.List;
import java.util.Objects;

public class Order {
    private int orderNumber = 0;
    private List<Products> basket;
    private String address;

    public Order(List<Products> basket, String address) {
        orderNumber++;
        this.basket = basket;
        this.address = address;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }
}