package Ex5;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Complex {
    private double realPart;
    private double imaginaryPart;
    
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    
    public Complex() {
        this(0, 0);
    }
    
    public Complex sum(@NotNull final Complex Obj) {
        return new Complex(realPart + Obj.realPart, imaginaryPart + Obj.imaginaryPart);
    }
    
    @Override
    public String toString() {
        return "Complex{Real part: " + realPart + "; Imaginary part: " + imaginaryPart + '}';
    }
    
    @Override
    public boolean equals(Object Obj) {
        if (this == Obj) return true;
        if (Obj == null || getClass() != Obj.getClass()) return false;
        Complex complex = (Complex) Obj;
        return Double.compare(complex.realPart, realPart) == 0 &&
                Double.compare(complex.imaginaryPart, imaginaryPart) == 0;
    }
}
