import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            counter++;
            scanner.nextLine();
        }
        long avg = 0;
        if (counter > 0) {
            avg = Math.round((double) sum / (double) counter);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
