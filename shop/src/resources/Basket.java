package resources;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Products> BASKET;

    public Basket() {
        BASKET = new ArrayList<>();
    }

    public List<Products> getBASKET() {
        return BASKET;
    }

}