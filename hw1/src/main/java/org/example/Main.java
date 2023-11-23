package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("Espresso", 50, 20, 80));
        hotDrinks.add(new HotDrink("Cappuccino", 60, 200, 75));
        hotDrinks.add(new HotDrink("Latte", 120, 300, 70));
        hotDrinks.add(new HotDrink("Iced coffee", 150, 300, 30));
        hotDrinks.add(new HotDrink("Caramel coffee", 130, 200, 80));
        HotDrinkVendingMachine hotDrink = new HotDrinkVendingMachine();
        hotDrink.initsProducts(hotDrinks);
        System.out.println(hotDrink.getProduct("Iced coffee"));
    }
}