package Ex10.School;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(
                "244",
                new Student("Vlad Stoleru", 10, 10),
                new Student("Vlad Duncea", 10, 10),
                new Student("Alexandru Burdescu", 9, 10),
                new Student("Tiberiu Danciu", 9, 9),
                new Student("Matei Daniel", 10 ,9)
        );
        System.out.println(catalog);
        System.out.println(catalog.getGroupAverage());
    }
}
