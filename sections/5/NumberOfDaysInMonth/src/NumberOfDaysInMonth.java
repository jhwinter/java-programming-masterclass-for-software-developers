public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        int numOfDays = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                numOfDays = 30;
                break;
            default:
                numOfDays = -1;
                break;
        }

        return numOfDays;
    }
}
