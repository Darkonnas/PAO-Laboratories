package Ex7;

import org.jetbrains.annotations.NotNull;

public class Store {
    private String name;
    private Product product1;
    private Product product2;
    private Product product3;
    
    public Store(String name, @NotNull final Product product1, @NotNull final Product product2, @NotNull final Product product3) {
        this.name = name;
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
    }
    
    public Store() {
        this("", new Product(), new Product(), new Product());
    }
    
    @Override
    public String toString() {
        return "{Store: " + name + "; Products: [" + product1 + ", " + product2 + ", " + product3 + "]}";
    }
    
    public double getTotalStore() {
        return product1.getTotalProduct() + product2.getTotalProduct() + product3.getTotalProduct();
    }
}
