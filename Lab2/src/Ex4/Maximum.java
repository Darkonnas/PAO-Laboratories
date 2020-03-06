package Ex4;

public class Maximum {
    private int number;
    
    public Maximum(int number) {
        this.number = number;
    }
    
    public Maximum() {
        this(0);
    }
    
    public int maxim(int a) {
        if (a > number) {
            return a;
        } else {
            return number;
        }
    }
    
    public int maxim(int a, int b) {
        return new Maximum(maxim(a)).maxim(b);
    }
    
    public int maxim(int a, int b, int c) {
        return maxim(a, maxim(b, c));
    }
    
    public int maxim(int a, int b, int c, int d) {
        return maxim(a, maxim(b, c, d));
    }
    
    public static void main(String[] args) {
        Maximum maximum = new Maximum();
        System.out.println(maximum.maxim(1, 2, 3, 4));
    }
}
