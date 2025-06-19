package com.EcommerceSearchFunction;
import java.util.*;

public class ProductSorter {
    public static List<Product> sortById(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(Comparator.comparingInt(Product::getProductId));
        return sorted;
    }

    public static List<Product> sortByName(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
        return sorted;
    }

    public static List<Product> sortByCategory(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(Comparator.comparing(Product::getProductCategory, String.CASE_INSENSITIVE_ORDER));
        return sorted;
    }
}
