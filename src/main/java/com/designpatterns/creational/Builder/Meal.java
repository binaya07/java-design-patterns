package com.designpatterns.creational.Builder;

import com.designpatterns.creational.Builder.entities.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public Meal(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float calcPrice() {
        float price = 0f;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }

}
