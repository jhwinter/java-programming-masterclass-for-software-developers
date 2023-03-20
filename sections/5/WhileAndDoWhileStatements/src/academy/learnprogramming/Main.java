package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        // same as above while loop
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + i);
//        }
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        int number = 4;
        int finishNumber = 20;
        int foundEvenNum = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            foundEvenNum++;
            if (foundEvenNum == 5) {
                System.out.println("Total even numbers found = " + foundEvenNum);
                break;
            }
        }
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
