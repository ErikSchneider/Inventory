package com.theironyard;

/**
 * Created by Erik on 5/24/16.
 */
public class Weapon extends Inventory {

    public Weapon(String itemName, int quantity) {
        super(itemName, quantity);
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = "Weapon";
    }
}
