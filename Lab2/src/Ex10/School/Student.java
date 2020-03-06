package Ex10.School;

public class Student {
    private String name;
    private double firstSemAverage;
    private double secondSemAverage;
    
    public Student(String name, double firstSemAverage, double secondSemAverage) {
        this.name = name;
        this.firstSemAverage = firstSemAverage;
        this.secondSemAverage = secondSemAverage;
    }
    
    public Student() {
        this("", 0.0, 0.0);
    }
    
    @Override
    public String toString() {
        return "{Name: " + name + "; First semester average: " + firstSemAverage + "; Second semester average: " + secondSemAverage + '}';
    }
    
    public double getYearAverage() {
        return (firstSemAverage + secondSemAverage) / 2;
    }
}
