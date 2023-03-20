public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println();
        System.out.println(isPalindrome(707));
        System.out.println();
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (Math.abs(number) > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        System.out.println("original " + originalNumber);
        System.out.println("reverse " + reverse);
        return Math.abs(originalNumber) == Math.abs(reverse);
    }
}
