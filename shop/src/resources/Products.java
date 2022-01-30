package resources;

public abstract class Products {
    private Type type;
    private String name;
    private int weight;
    private int price;
    private String manufacturer;
    private int rating;
    private int quantity;

    public Products(Type type, String name, int weight, int price, String manufacturer, int rating, int quantity) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = rating;
        this.quantity = quantity;
    }

    public abstract Type getType();

    public abstract String getName();

    public abstract int getWeight();

    public abstract String getManufacturer();

    public abstract int getRating();

    public abstract int getPrice();

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);
}