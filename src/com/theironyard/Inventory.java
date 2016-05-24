package com.theironyard;

/**
 * Created by Erik on 5/23/16.
 */
public class Inventory {
    String itemName;
    int quantity;
    String category;

    public Inventory() {
    }

    public Inventory(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
}
