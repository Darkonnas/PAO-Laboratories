package Ex9;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {
    public static int[] copyFromFirstOccurrence(@NotNull final int[] source, int elem) {
        int index = -1;
        for(int i = 0; i < source.length; ++i) {
            if(source[i] == elem) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            return new int[0];
        }
        return Arrays.copyOfRange(source, index, source.length);
    }
    
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 5, 6, 9, 12, 22, 7, 20};
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(copyFromFirstOccurrence(myArray, 9)));
    }
}
