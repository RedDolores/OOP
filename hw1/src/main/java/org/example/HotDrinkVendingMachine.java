package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> hotDrinks = new ArrayList<>();

    @Override
    public void initsProducts(List<Product> productList) {
        this.hotDrinks = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : hotDrinks) {
            if (item.getName().equals(name))
                return item;
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product item : hotDrinks)
            if (item.getName().equals(name) &&
                    ((HotDrink) item).getVolume() == volume &&
                    ((HotDrink) item).getTemperature() == temperature)
                return item;
        return null;
    }
}
