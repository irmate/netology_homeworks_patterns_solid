package resources;

public class Products {
    Type type;
    String name;
    int weight;
    int price;
    String manufacturer;
    int rating;
    int quantity;

    public Products(Type type, String name, int weight, int price, String manufacturer, int rating, int quantity) {
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

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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