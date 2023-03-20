package academy.learnprogramming;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[maxIndex - i];
            array[maxIndex - i] = array[i];
            array[i] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
