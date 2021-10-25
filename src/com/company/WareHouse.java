package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WareHouse {
    private final ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public static void getDearestProduct(WareHouse wareHouse) {
        System.out.println("The most expensive product");
        Product max = Collections.max(wareHouse.products, new ProductComparator());
        max.printInfo();
    }
}
class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}