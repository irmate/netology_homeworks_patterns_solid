package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DeliverySystem implements Delivery {
    public static DeliverySystem deliverySystem = null;
    private final Map<Integer, Order> ORDER_MAP = new HashMap<>();

    private DeliverySystem() {
    }

    public static DeliverySystem getInstance() {
        if (deliverySystem == null) deliverySystem = new DeliverySystem();
        return deliverySystem;
    }

    @Override
    public void send(Order order) {
        Logger logger = ConsoleLogger.getInstance();
        ORDER_MAP.put(order.getOrderNumber(), order);
        logger.log("Ваш заказ №" + order.getOrderNumber() + " отправлен по адресу: " + order.getAddress());
    }

    @Override
    public void trace(int orderNumber) {
        Logger logger = ConsoleLogger.getInstance();
        Random random = new Random();
        if (random.nextBoolean()) {
            logger.log("Ваш заказ №" + orderNumber + " доставлен");
        } else {
            logger.log("Ваш заказ №" + orderNumber + " ещё в пути");
        }
    }

    public Map<Integer, Order> getORDER_MAP() {
        return ORDER_MAP;
    }
}