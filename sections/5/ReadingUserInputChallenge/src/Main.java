import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

//        while (true) {
//            System.out.println("Enter number #" + counter + ":");
//            if (scanner.hasNextInt()) {
//                sum += scanner.nextInt();
//                counter++;
//                if (counter == 11) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine();
//        }

        while (counter < 11) {
            System.out.println("Enter number #" + counter + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("sum = " + sum);
    }
}
