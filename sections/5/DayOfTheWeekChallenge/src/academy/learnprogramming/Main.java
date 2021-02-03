package academy.learnprogramming;

public class Main {
    private static String INVALID = "Invalid day";
    private static String SUNDAY = "Sunday";
    private static String MONDAY = "Monday";
    private static String TUESDAY = "Tuesday";
    private static String WEDNESDAY = "Wednesday";
    private static String THURSDAY = "Thursday";
    private static String FRIDAY = "Friday";
    private static String SATURDAY = "Saturday";

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(8);
        printDayOfTheWeek(-1);

        printDayOfTheWeekIf(0);
        printDayOfTheWeekIf(1);
        printDayOfTheWeekIf(2);
        printDayOfTheWeekIf(3);
        printDayOfTheWeekIf(4);
        printDayOfTheWeekIf(5);
        printDayOfTheWeekIf(6);
        printDayOfTheWeekIf(8);
        printDayOfTheWeekIf(-1);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println(SUNDAY);
                break;
            case 1:
                System.out.println(MONDAY);
                break;
            case 2:
                System.out.println(TUESDAY);
                break;
            case 3:
                System.out.println(WEDNESDAY);
                break;
            case 4:
                System.out.println(THURSDAY);
                break;
            case 5:
                System.out.println(FRIDAY);
                break;
            case 6:
                System.out.println(SATURDAY);
                break;
            default:
                System.out.println(INVALID);
                break;
        }
    }

    public static void printDayOfTheWeekIf(int day) {
        if (day == 0) {
            System.out.println(SUNDAY);
        } else if (day == 1) {
            System.out.println(MONDAY);
        } else if (day == 2) {
            System.out.println(TUESDAY);
        } else if (day == 3) {
            System.out.println(WEDNESDAY);
        } else if (day == 4) {
            System.out.println(THURSDAY);
        } else if (day == 5) {
            System.out.println(FRIDAY);
        } else if (day == 6) {
            System.out.println(SATURDAY);
        } else {
            System.out.println(INVALID);
        }

    }
}
