package services;

import resources.Products;
import resources.Type;

import java.util.Arrays;
import java.util.List;

public class Filter {

    private List<Products> source;
    private final List<Processor> PROCESSORS = Arrays.asList(
            (obj) -> {
                if (obj.getClass() == Type.class) {
                    source.stream()
                            .filter(x -> x.getType().equals(obj))
                            .forEach(System.out::println);
                    return true;
                }
                return false;
            },
            (obj) -> {
                if (obj.getClass() == String.class) {
                    source.stream()
                            .filter(x -> x.getManufacturer().equals(obj))
                            .forEach(System.out::println);
                    return true;
                }
                return false;
            },
            (obj) -> {
                Logger logger = ConsoleLogger.getInstance();
                logger.log("Данный параметр не поддерживается фильтром");
                return true;
            }
    );

    public Filter(List<Products> source) {
        this.source = source;
    }

    public List<Processor> getPROCESSORS() {
        return PROCESSORS;
    }
}