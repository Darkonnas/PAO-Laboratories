package Ex8;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    public static int count = 0;
    
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++count;
    }
    
    public Student() {
        this("FirstName", "LastName");
    }
    
    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }
    
    public static void main(String[] args) {
        Student[] myStudents = new Student[]{
                new Student("Vlad", "Stoleru"),
                new Student("Vlad", "Duncea"),
                new Student("Alexandru", "Burdescu"),
                new Student("Tiberiu", "Danciu"),
                new Student("Daniel", "Matei")};
        System.out.println(Arrays.toString(myStudents));
        System.out.println(Student.count);
    }
}
