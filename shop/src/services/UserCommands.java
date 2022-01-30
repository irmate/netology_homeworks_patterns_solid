package services;

import resources.Products;

import java.util.List;

public interface UserCommands {
    public void look(List<Products> basket);

    public void add(List<Products> basket, Products product);

    public void undoAdding(List<Products> basket, Products product);

    public void order(List<Products> basket, String address);

    public void repeatOrder(int orderNumber);

    public void traceOrder(int orderNumber);
}