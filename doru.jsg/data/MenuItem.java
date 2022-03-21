package data;

public class MenuItem {
    private int id;
    private String name;
    private double price;


    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public static MenuItem createHamburger(String meat, String bun) {
        return new Hamburger(1000, "Hamburger", 7.0, meat, bun);
    }

    public static MenuItem createHealthyBurger(String meat) {
        return new HealthyBurger(1001, "Healthy Burger", 12.0, meat);
    }

    public static MenuItem createDeluxeBurger(String meat, String bun) {
        return new DeluxeBurger(1002, "Deluxe Burger", 14.0, meat, bun);
    }

    public static MenuItem createSideItem(int id) {
        if (id == 1) {
            return new Sides(id, "Cheese", 2.0);
        }

        if (id == 2) {
            return new Sides(id, "Lettuce", 0.5);

        }
        if (id == 3) {
            return new Sides(id, "Tomato", 0.5);

        }
        if (id == 4) {
            return new Sides(id, "Extra Secret Sauce", 1.0);

        }
        if (id == 5) {
            return new Sides(id, "Pickles", 0.5);

        }
        if (id == 6) {
            return new Sides(id, "Onion", 0.5);

        }
        //
        if (id == 11) {
            return new Sides(id, "Small Coke", 3.0);

        }
        if (id == 12) {
            return new Sides(id, "Large Coke", 5.0);

        }
        if (id == 13) {
            return new Sides(id, "Small Fries", 2.5);

        }
        if (id == 14) {
            return new Sides(id, "Large Fries", 4.0);

        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}