public class DiagonalStar {
    public static void main(String[] args) {
        System.out.println("printSquareStar(2): ");
        printSquareStar(2);
        System.out.println();

        System.out.println("printSquareStar(5): ");
        printSquareStar(5);
        System.out.println();

        System.out.println("printSquareStar(8): ");
        printSquareStar(8);
        System.out.println();
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                for (int col = 0; col < number; col++) {
                    if (row == 0 || row == (number - 1)) {
                        System.out.print("*");
                    } else if (col == 0 || col == (number - 1)) {
                        System.out.print("*");
                    } else if (row == col) {
                        System.out.print("*");
                    } else if (col == (number - (row + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
