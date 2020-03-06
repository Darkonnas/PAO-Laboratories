package Ex7;

public class Main {
    public static void main(String[] args) {
        Store myStore = new Store("Ikea",
                new Product("Table", 100.79, 4),
                new Product( "Chair", 68.99, 10),
                new Product("Wooden door", 250.49, 5));
        System.out.println(myStore);
        System.out.println(myStore.getTotalStore());
    }
}
