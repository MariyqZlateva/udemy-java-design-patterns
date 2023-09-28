package com.zlateva;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double totalPrice = 0.00;
        for (Item item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
