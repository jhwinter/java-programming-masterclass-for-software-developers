public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("12, 23 = " + hasSharedDigit(12, 23));
        System.out.println("9, 99 = " + hasSharedDigit(9, 99));
        System.out.println("15, 55 = " + hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        int lastDigitA = a % 10;
        int firstDigitA = (a / 10) % 10;

        int lastDigitB = b % 10;
        int firstDigitB = (b / 10) % 10;

        return (
                (lastDigitA == lastDigitB || lastDigitA == firstDigitB)
                || (firstDigitA == lastDigitB || firstDigitA == firstDigitB)
        );
    }
}
