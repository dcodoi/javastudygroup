package input;

import calc.Order;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);
    private static Order order = new Order();


    public static void InputMenu() {
        printWelcome();
        boolean quit = false;
        while (!quit) {
            printMainMenu();
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    createOrder();
                    break;
                case 9:
                    scanner.close();
                    quit = true;
                    break;
                case 23:

                    break;
            }
        }
    }

    private static void createOrder() {
        printMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();
        printBurgerConfirm(choice);
        switch (choice) {
            case 1:
            case 2:
            case 3:
                //todo could be better
                String meat = selectMeatType();
                String bun = selectBunType(choice);
                addMenuItem(choice, meat, bun);

                order.printReceipt();
                order.getTotalPrice();

                break;

            case 4:

                break;

            case 0:
                break;
        }
    }

    private static String selectMeatType() {
        System.out.println("Select meat type: ");
        return scanner.nextLine();
    }

    private static String selectBunType(int i) {
        if (i != 2) {
            System.out.println("Select bun type: ");
            return scanner.nextLine();
        }
        return null;
    }

    private static int selectSide(int i) {
        System.out.print("Side " + i + ": ");
        return scanner.nextInt();
    }

    private static void addMenuItem(int i, String meat, String bun) {
        order.createOrder();
        printSides();
        if (i == 1) {
            order.addBurgerToOrder(1000, meat, bun);
            for (int j = 0; j < 4; j++) {
                order.addSideToOrder(selectSide(j + 1));
            }
        }
        if (i == 2) {
            order.addBurgerToOrder(1001, meat, bun);
            for (int j = 0; j < 6; j++) {
                order.addSideToOrder(selectSide(j + 1));
            }
        }
        if (i == 3) {
            order.addBurgerToOrder(1002, meat, bun);
            order.addSideToOrder(12);
            order.addSideToOrder(14);
        }
    }


    private static void printWelcome() {
        System.out.println("Welcome to Bills Burgers! ");
        System.out.println(" ");
        System.out.println("Please, prompt correctly, we don't handle errors yet"); //todo

    }

    private static void printMainMenu() {
        System.out.println(" ");
        System.out.println("What would you like to do? ");
        System.out.println(" ");
        System.out.println("[1] Create new order");
        System.out.println("[9] Exit");
        //System.out.println("[23] /*ADMIN ONLY!!!*/ Print previous order"); //todo
    }

    private static void printMenu() {
        System.out.println("[1] Classic Burger [$7]");
        System.out.println("[2] Healthy Burger with some additional sides [$12] ");
        System.out.println("[3] Deluxe Burger with large Coke and large fries [$13]");
        System.out.println("[4] Only side dishes  /* not available yet */"); //todo
        System.out.println(" ");
        System.out.println("[0] Cancel");
    }

    private static void printBurgerConfirm(int i) {
        if (i == 1) {
            System.out.println("Classic Burger selected. You can choose up to 4 sides.");
        }
        if (i == 2) {
            System.out.println("Healthy Burger selected. You can choose up to 6 sides.");
        }
        if (i == 3) {
            System.out.println("Deluxe Burger selected. Large Coke and Large Fries added.");
        }
    }

    private static void printSides() {
        System.out.println("Select side dishes: ");
        System.out.println(" ");
        System.out.println("[1]Cheese [$2]");
        System.out.println("[2]Lettuce [50c]");
        System.out.println("[3]Tomato [50c]");
        System.out.println("[4]Extra Secret Sauce [$1]");
        System.out.println("[5]Pickles [50c]");
        System.out.println("[6]Onion [50c]");
        System.out.println(" ");
        System.out.println("[11]Small Coke [$3]");
        System.out.println("[12]Large Coke [$5]");
        System.out.println("[13]Small Fries [$2.50]");
        System.out.println("[14]Large Fries [$4]");
        System.out.println(" ");
    }
}