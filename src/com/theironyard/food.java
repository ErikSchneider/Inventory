package com.theironyard;

/**
 * Created by Erik on 5/24/16.
 */
public class Food extends Inventory{

    public Food(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = "Food";
    }


}
