public class TeenNumberChecker {

    public static boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
}
