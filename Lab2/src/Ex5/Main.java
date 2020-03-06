package Ex5;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 3);
        Complex c2 = new Complex(1, 3);
        System.out.println(c1.sum(c2));
        System.out.println(c1.equals(c2));
    }
}
