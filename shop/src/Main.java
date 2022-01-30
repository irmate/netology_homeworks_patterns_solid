import resources.*;
import services.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Showcase showcase = new Showcase();

    public static void show() {
        Logger logger = ConsoleLogger.getInstance();
        if (!showcase.getShowcase().isEmpty()) {
            for (int i = 0; i < showcase.getShowcase().size(); i++) {
                System.out.printf("%d. %s\n", i + 1, showcase.getShowcase().get(i));
            }
        } else {
            logger.log("Товар закончился. Извините");
        }
    }

    public static void filter(Object obj, List<Products> source) {
        Filter filter = new Filter(source);
        for (Processor processor : filter.getPROCESSORS())
            if (processor.process(obj))
                break;
    }

    public static void sorter(Object obj, List<Products> source) {
        Sorter sorter = new Sorter(source);
        for (Processor processor : sorter.getPROCESSORS())
            if (processor.process(obj))
                break;
    }

    public static void main(String[] args) {
        UserCommands userCommands = new UserCommandsImpl();
        Basket basket = new Basket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Добро пожаловать в онлайн кондитерскую!
                Доступные команды:
                1. Показать ассортимент товара;
                2. Отфильтровать товар по типу/изготовителю;
                3. Отсортировать товар по цене/рейтингу;
                4. Посмотреть корзину;
                5. Добавить товар в корзину;
                6. Удалить товар из корзины;
                7. Сделать заказ;
                8. Повторить заказ;
                9. Отследить заказ;
                10. Выйти из кондитерской.
                """);
        while (true) {
            String choice = scanner.nextLine();
            switch (Integer.parseInt(choice)) {
                case 1:
                    show();
                    break;
                case 2:
                    System.out.println("Укажите тип товара для фильтра: Торт, Капкейк, Эклер, Чизкейк или введите наимнование Изготовителя");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "Торт" -> filter(Type.CAKE, showcase.getShowcase());
                        case "Капкейк" -> filter(Type.KAPCAKE, showcase.getShowcase());
                        case "Эклер" -> filter(Type.ECLAIR, showcase.getShowcase());
                        case "Чизкейк" -> filter(Type.CHEESECAKE, showcase.getShowcase());
                        default -> filter(choice, showcase.getShowcase());
                    }
                    break;
                case 3:
                    System.out.println("Укажите параметр для сортировки: Цена или Рейтинг");
                    choice = scanner.nextLine();
                    sorter(choice, showcase.getShowcase());
                    break;
                case 4:
                    System.out.println("Ваша корзина:");
                    userCommands.look(basket.getBASKET());
                    break;
                case 5:
                    System.out.println("Укажите порядковый номер понравившегося товара");
                    choice = scanner.nextLine();
                    userCommands.add(basket.getBASKET(), showcase.getShowcase().get(Integer.parseInt(choice) - 1));
                    break;
                case 6:
                    System.out.println("Укажите порядковый номер товара в корзине");
                    choice = scanner.nextLine();
                    userCommands.undoAdding(basket.getBASKET(), basket.getBASKET().get(Integer.parseInt(choice) - 1));
                    break;
                case 7:
                    System.out.println("Укажите адрес для доставки");
                    choice = scanner.nextLine();
                    userCommands.order(basket.getBASKET(), choice);
                    break;
                case 8:
                    System.out.println("Укажите номер заказа который хотите повторить");
                    choice = scanner.nextLine();
                    userCommands.repeatOrder(Integer.parseInt(choice));
                    break;
                case 9:
                    System.out.println("Укажите номер заказа который хотите отследить");
                    choice = scanner.nextLine();
                    userCommands.traceOrder(Integer.parseInt(choice));
                    break;
                case 10:
                    System.exit(0);
            }
        }
    }
}