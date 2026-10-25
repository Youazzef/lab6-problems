package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String n, double p, int q){
        name = n; price = p; quantity = q;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ", " + price + " MAD" + " (x" + quantity + ")";
    }
}
