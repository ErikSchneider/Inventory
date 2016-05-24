package com.theironyard;

/**
 * Created by Erik on 5/24/16.
 */
public class Resource extends Inventory {

    public Resource(String itemName, int quantity) {
        super(itemName, quantity);
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = "Resource";
    }
}
