package services;

import resources.Products;

import java.util.List;

public class UserCommandsImpl implements UserCommands {

    @Override
    public void look(List<Products> basket) {
        Logger logger = ConsoleLogger.getInstance();
        if (!basket.isEmpty()) {
            for (int i = 0; i < basket.size(); i++) {
                System.out.printf(
                        "%d. Тип продукта: %s, Название: %s, Вес: %s, Цена: %s, Изготовитель: %s \n",
                        i + 1,
                        basket.get(i).getType(),
                        basket.get(i).getName(),
                        basket.get(i).getWeight(),
                        basket.get(i).getPrice(),
                        basket.get(i).getManufacturer()
                );
            }
        } else {
            logger.log("Корзина пуста");
        }
    }

    @Override
    public void add(List<Products> basket, Products product) {
        Logger logger = ConsoleLogger.getInstance();
        if (basket != null) {
            basket.add(product);
            product.setQuantity(product.getQuantity() - 1);
            logger.log(product.getType() + " " + product.getName() + " был добавлен в корзину");
        }
    }

    @Override
    public void undoAdding(List<Products> basket, Products product) {
        Logger logger = ConsoleLogger.getInstance();
        if (basket != null) {
            basket.remove(product);
            logger.log(product.getType() + " " + product.getName() + " был удалён из корзины");
        }
    }

    @Override
    public void order(List<Products> basket, String address) {
        Delivery delivery = DeliverySystem.getInstance();
        Order order = new Order(basket, address);
        delivery.send(order);
    }

    @Override
    public void repeatOrder(int orderNumber) {
        DeliverySystem delivery = DeliverySystem.getInstance();
        delivery.send(delivery.getORDER_MAP().get(orderNumber));
    }

    @Override
    public void traceOrder(int orderNumber) {
        Delivery delivery = DeliverySystem.getInstance();
        delivery.trace(orderNumber);
    }
}