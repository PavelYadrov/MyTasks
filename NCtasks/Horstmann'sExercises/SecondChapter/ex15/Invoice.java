package com.exercises.ex15;

import java.util.ArrayList;

public class Invoice {
    private static class Item  {
        String description;
        int quantity;
        double unitPrice;
        double price() {return quantity*unitPrice;}

        @Override
        public String toString() {
            return "Item{" +
                    "description='" + description + '\'' +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "items=" + items +
                '}';
    }
}
