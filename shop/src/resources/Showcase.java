package resources;

import java.util.Arrays;
import java.util.List;

public class Showcase {

    private final List<Products> SHOWCASE;

    public Showcase() {
        SHOWCASE = Arrays.asList(
                new Products(Type.CAKE, "Дракон", 1500, 980, "Кондитерская №1", 7, 4),
                new Products(Type.CAKE, "Сникерс", 1200, 1150, "Кондитерская №1", 8, 7),
                new Products(Type.CAKE, "Красный бархат", 800, 870, "Корица", 9, 5),
                new Products(Type.CAKE, "Прага", 700, 480, "Трюфель", 3, 2),
                new Products(Type.KAPCAKE, "Кокосовый", 150, 210, "ХочуТорт", 5, 15),
                new Products(Type.KAPCAKE, "Шоколадный", 150, 250, "ХочуТорт", 6, 11),
                new Products(Type.KAPCAKE, "Ягодный", 150, 250, "Трюфель", 7, 13),
                new Products(Type.KAPCAKE, "Фисташковый", 150, 250, "ХочуТорт", 6, 12),
                new Products(Type.ECLAIR, "Йогуртовый крем", 120, 150, "Корица", 8, 15),
                new Products(Type.ECLAIR, "Малина-фисташка", 120, 150, "Корица", 7, 17),
                new Products(Type.ECLAIR, "Ваниль", 120, 150, "ХочуТорт", 4, 23),
                new Products(Type.ECLAIR, "Твикс", 120, 150, "Корица", 10, 8),
                new Products(Type.CHEESECAKE, "Орео", 180, 230, "Корица", 6, 9),
                new Products(Type.CHEESECAKE, "Фисташковый", 180, 230, "Печки-лавочки", 5, 10),
                new Products(Type.CHEESECAKE, "Ванильный", 180, 230, "Печки-лавочки", 6, 11),
                new Products(Type.CHEESECAKE, "Сыроедческий черничный", 180, 230, "Кондитерская №1", 10, 5)
        );
    }

    public List<Products> getShowcase() {
        return SHOWCASE;
    }
}