package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem(int position) {
        // String theItem = groceryList.get(position);
        groceryList.remove(position);
        // System.out.println("Grocery item " + theItem + " has been removed");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

    // public String findItem(String searchItem) {
    //     // boolean exists = groceryList.contains(searchItem);
    //     int position = groceryList.indexOf(searchItem);
    //     if (position < 0) {
    //         return null;
    //     }
    //     return groceryList.get(position);
    // }
}
