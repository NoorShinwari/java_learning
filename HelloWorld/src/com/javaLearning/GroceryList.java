package com.javaLearning;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }

    }

    public void modifyGroceryItem(int postion, String newItem) {
        groceryList.set(postion, newItem);

        System.out.println("Grocery Item " + (postion + 1) + " has been modified");

    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.remove(position);
        System.out.println(theItem + "  is removed from the list");

    }

    public String findItem(String searchItem) {
        int postion = groceryList.indexOf(searchItem);
        if (postion >= 0) {
            return groceryList.get(postion);
        }
        return null;

    }

}
