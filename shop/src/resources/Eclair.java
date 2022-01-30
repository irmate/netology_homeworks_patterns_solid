package resources;

public class Eclair extends Products {
    private Type type;
    private String name;
    private int weight;
    private int price;
    private String manufacturer;
    private int rating;
    private int quantity;

    public Eclair(Type type, String name, int weight, int price, String manufacturer, int rating, int quantity) {
        super(type, name, weight, price, manufacturer, rating, quantity);
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = rating;
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Тип продукта: " + type +
                ", Название: '" + name + '\'' +
                ", Масса: " + weight +
                ", Цена: " + price +
                ", Изготовитель: '" + manufacturer + '\'' +
                ", Рэйтинг: " + rating +
                ", Доступное количество: " + quantity;
    }
}