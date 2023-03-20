public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("41, 22, 71 = " + hasSameLastDigit(41, 22, 71));
        System.out.println("23, 32, 42 = " + hasSameLastDigit(23, 32, 42));
        System.out.println("9, 99, 999 = " + hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;
        return (
                (lastDigitA == lastDigitB || lastDigitA == lastDigitC)
                || (lastDigitB == lastDigitC)
        );
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
