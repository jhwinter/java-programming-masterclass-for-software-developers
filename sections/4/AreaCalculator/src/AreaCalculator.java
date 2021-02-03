public class AreaCalculator {

    private static final double INVALID_VALUE = -1d;

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }
        return x * y;
    }
}
