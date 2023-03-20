package academy.learnprogramming;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        System.out.println("Enter count:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minElem = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElem) {
                minElem = array[i];
            }
        }
        System.out.println("Minimum Element: " + minElem);
        return minElem;
    }
}
