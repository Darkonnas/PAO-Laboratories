package Ex1;

import java.security.InvalidParameterException;
import java.util.Arrays;

class Queue {
    private int[] internalVector;
    private int size;
    
    public Queue(int size) throws InvalidParameterException {
        if (size < 0) {
            throw new InvalidParameterException("Queue size cannot be a negative number!");
        }
        this.size = size;
        if (size > 0) {
            internalVector = new int[size];
        } else {
            internalVector = null;
        }
    }
    
    public Queue() {
        this(100);
    }
    
    public void push(int elem) {
        if (internalVector == null) {
            internalVector = new int[++size];
        } else {
            internalVector = Arrays.copyOf(internalVector, ++size);
        }
        internalVector[size - 1] = elem;
    }
    
    public int pop() throws IndexOutOfBoundsException {
        if (internalVector == null) {
            throw new IndexOutOfBoundsException("Queue is empty!");
        }
        int elem = internalVector[0];
        internalVector = Arrays.copyOfRange(internalVector, 1, size);
        --size;
        return elem;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        if (size == 0) {
            return "Ex1.Queue is empty!";
        }
        StringBuilder asString = new StringBuilder(3 * size);
        asString.append("Queue{Size: ");
        asString.append(size);
        asString.append("; Elements: ");
        for (int i = 0; i < size; ++i) {
            asString.append(internalVector[i]);
            if (i < size - 1) {
                asString.append(' ');
            }
        }
        asString.append("}");
        return asString.toString();
    }
}
