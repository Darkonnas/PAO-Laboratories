package Ex10.School;

import org.jetbrains.annotations.NotNull;

public class Catalog {
    private String group;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;
    
    public Catalog(String group, @NotNull Student student1, @NotNull Student student2, @NotNull Student student3, @NotNull Student student4, @NotNull Student student5) {
        this.group = group;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
        this.student5 = student5;
    }
    
    public Catalog() {
        this("", new Student(), new Student(), new Student(), new Student(), new Student());
    }
    
    @Override
    public String toString() {
        return "{Group: " + group + "; Students: [" + student1 + ", " + student2 + ", " + student3 + ", " + student4 + ", " + student5 + "]}";
    }
    
    public double getGroupAverage() {
        return (student1.getYearAverage() + student2.getYearAverage() + student3.getYearAverage() + student4.getYearAverage() + student5.getYearAverage()) / 5;
    }
}
