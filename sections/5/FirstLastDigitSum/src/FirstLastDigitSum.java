public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("252 = " + sumFirstAndLastDigit(252));
        System.out.println("257 = " + sumFirstAndLastDigit(257));
        System.out.println("0 = " + sumFirstAndLastDigit(0));
        System.out.println("5 = " + sumFirstAndLastDigit(5));
        System.out.println("-10 = " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        // extract the least-significant digit
        int lastDigit = number % 10;
        int firstDigit = 0;
        // keep looping until we've extracted the most-significant digit
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            if (number == 0) {
                firstDigit = digit;
            }
        }
        return firstDigit + lastDigit;
    }
}
