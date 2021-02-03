public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int numA = (int)(a * 1000);
        int numB = (int)(b * 1000);

        return numA == numB;
    }
}
