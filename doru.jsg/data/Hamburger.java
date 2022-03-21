package data;

public class Hamburger extends MenuItem {
    private String meat;
    private String bun;

    public Hamburger(int id, String name, double price, String meat, String bun) {
        super(id, name, price);
        this.meat = meat;
        this.bun = bun;
    }

    public String getMeat() {
        return meat;
    }

    public String getBun() {
        return bun;
    }
}


