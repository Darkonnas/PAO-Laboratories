package Ex6.geometry;

import org.jetbrains.annotations.NotNull;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
        this(0, 0);
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Point{x: " + x + "; y: " + y + '}';
    }
    
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    
    public double distance(@NotNull final Point Obj) {
        return Math.sqrt(Math.pow(Obj.x - x, 2) + Math.pow(Obj.y - y, 2));
    }
}
