public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("gcd of 25, 15 = " + getGreatestCommonDivisor(25, 15));
        System.out.println("gcd of 12, 30 = " + getGreatestCommonDivisor(12, 30));
        System.out.println("gcd of 9, 18 = " + getGreatestCommonDivisor(9, 18));
        System.out.println("gcd of 81, 153 = " + getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int gcd = 0;
        int smallerNumber = Math.min(first, second);
        int largerNumber = Math.max(first, second);
        for (int i = smallerNumber; i > 0; i--) {
            if (smallerNumber % i == 0 && largerNumber % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
