package services;

import resources.Products;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    private List<Products> source;
    private final List<Processor> PROCESSORS = Arrays.asList(
            (obj) -> {
                if (obj.equals("Цена")) {
                    source.stream()
                            .sorted(Comparator.comparing(Products::getPrice, Comparator.reverseOrder()))
                            .forEach(System.out::println);
                    return true;
                }
                return false;
            },
            (obj) -> {
                if (obj.equals("Рейтинг")) {
                    source.stream()
                            .sorted(Comparator.comparing(Products::getRating, Comparator.reverseOrder()))
                            .forEach(System.out::println);
                    return true;
                }
                return false;
            },
            (obj) -> {
                Logger logger = ConsoleLogger.getInstance();
                logger.log("Данный параметр не поддерживается сортировщиком");
                return true;
            }
    );

    public Sorter(List<Products> source) {
        this.source = source;
    }

    public List<Processor> getPROCESSORS() {
        return PROCESSORS;
    }
}