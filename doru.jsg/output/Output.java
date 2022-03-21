package output;

import data.MenuItem;


public class Output {

    public static void printReceipt() {
        System.out.println("\nYour receipt:\n");
    }

    public static void printMeatAndBunType(String meatType, String bunType){
        System.out.println("Selected meat: " + meatType);
        System.out.println("Selected bun: " + bunType);
        System.out.println("");

    }

    public static void printItems(int i, MenuItem item) {
        String name = item.getName();
        double price = item.getPrice();
        i += 1;
        System.out.println("Item " + i + ": " + name + ", price: $" + price);
    }
}