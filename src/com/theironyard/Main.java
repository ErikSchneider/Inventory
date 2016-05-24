package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void createItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Enter the item you have acquired");
        String text = scanner.nextLine();
        Inventory item = new Inventory(text, 0);
        items.add(item);
    }

    public static void removeItem(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Which item would you like to remove?");
        for (int i = 0; i > items.size() - 1; i ++) {
            System.out.println(items[i])
        }

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

    public static void updateQuantiity(Scanner scanner, ArrayList<Inventory> items) {
        System.out.println("Which item would you like to adjust the quantity of?");

    }

    public static void main(String[] args) {
        ArrayList<Inventory> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
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
                    updateQuantiity(scanner, items);
                    break;

            }
        }
    }
}