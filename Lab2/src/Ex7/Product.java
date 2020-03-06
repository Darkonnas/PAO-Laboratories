package Ex7;

public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Product() {
        this("", 0, 0);
    }
    
    @Override
    public String toString() {
        return "{Product: " + name + "; price: " + price + "; quantity: " + quantity + '}';
    }
    
    public double getTotalProduct() {
        return price * quantity;
    }
}
