package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void createItem (Scanner scanner, ArrayList<Inventory> items ) {
        System.out.println("Enter the item you have acquired");
        String itemName = scanner.nextLine();
        System.out.println("What type of item is this?");
        String category = scanner.nextLine();
        Inventory inventory = null;

        switch(category) {
            case "Food":
                inventory = new Food(itemName, 1);
                break;
            case "Drink":
                inventory = new Drink(itemName, 1);
                break;
            case "Armor":
                inventory = new Armor(itemName, 1);
                break;
            case "Weapon":
                inventory = new Weapon(itemName, 1);
                break;
            case "Resource":
                inventory = new Resource(itemName, 1);
                break;
            default:
                System.out.println("Invalid item type.");

        }

        items.add(inventory);


//    public static void createItem(Scanner scanner, ArrayList<Inventory> items) {
//        System.out.println("Enter the item you have acquired");
//        String itemName = scanner.nextLine();
//        Inventory item = new Inventory(itemName, 1);
//        items.add(item);
    }

    public static void listItems(ArrayList<Inventory> items) {
//        int inventoryNumber = 1;
        for (int i = 0; i < items.size(); i ++) {
            Inventory object = items.get(i);
//            System.out.println(inventoryNumber + ". " + object.itemName + " " + "[" + object.quantity + "]" + "\n");
            System.out.printf("%s. %s [%s] - %s \n\n", i + 1, object.itemName, object.quantity, object.category);

        }
//        for (Inventory object : items) {
//            System.out.println(inventoryNumber + ". " + object.itemName + " " + object.quantity + "\n");
//            inventoryNumber ++;
//        }

    }

    public static void removeItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Which item would you like to remove?");
        listItems(items);

        String remove = scanner.nextLine();
        try {
            int selectNum = Integer.valueOf(remove);
            items.remove(selectNum - 1);

        }
        catch (NumberFormatException e) {
            System.out.println("You didn't type a number!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number isn't valid");
        }
    }

    public static void updateQuantity(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Which item would you like to adjust the quantity of?");
        listItems(items);
        int itemNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Do you want to add or subtract?");
        String addOrSubtract = scanner.nextLine();
        System.out.println("How much?");
        int adjustedAmount = Integer.valueOf(scanner.nextLine());
        if (addOrSubtract.equals("subtract")) {
            items.get(itemNumber - 1).quantity -= adjustedAmount;
            if (items.get(itemNumber - 1).quantity <= 0);
            items.remove(itemNumber - 1);
        }

        else if (addOrSubtract.equals("add")) {
            items.get(itemNumber - 1).quantity += adjustedAmount;
        }


    }

    public static void main(String[] args) {
        ArrayList<Inventory> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            listItems(items);
            System.out.println("1. Create new item");
            System.out.println("2. Remove item");
            System.out.println("3. Update quantity");

            String option = scanner.nextLine();

            switch (option) {

                case ("1"):
                    createItem(scanner, items);
                    break;

                case ("2"):
                    removeItem(scanner, items);
                    break;

                case ("3"):
                    updateQuantity(scanner, items);
                    break;

            }
        }
    }
}