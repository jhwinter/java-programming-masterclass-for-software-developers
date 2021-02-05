public class NumberToWords {
    public static void main(String[] args) {
        System.out.println("getDigitCount");
        System.out.println("0 = " + getDigitCount(0));
        System.out.println("123 = " + getDigitCount(123));
        System.out.println("-12 = " + getDigitCount(-12));
        System.out.println("5200 = " + getDigitCount(5200));
        System.out.println();

        System.out.println("reverse");
        System.out.println("-121 = " + reverse(-121));
        System.out.println("1212 = " + reverse(1212));
        System.out.println("1234 = " + reverse(1234));
        System.out.println("100 = " + reverse(100));
        System.out.println();

        System.out.println("numberToWords");
        System.out.println("123 = ");
        numberToWords(123);
        System.out.println();
        System.out.println("1010 = ");
        numberToWords(1010);
        System.out.println();
        System.out.println("1000 = ");
        numberToWords(1000);
        System.out.println();
        System.out.println("-12 = ");
        numberToWords(-12);
        System.out.println();
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int digitDifference = getDigitCount(number) - getDigitCount(reversedNumber);

            do {
                String word = "";
                int lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        word = "Zero";
                        break;
                    case 1:
                        word = "One";
                        break;
                    case 2:
                        word = "Two";
                        break;
                    case 3:
                        word = "Three";
                        break;
                    case 4:
                        word = "Four";
                        break;
                    case 5:
                        word = "Five";
                        break;
                    case 6:
                        word = "Six";
                        break;
                    case 7:
                        word = "Seven";
                        break;
                    case 8:
                        word = "Eight";
                        break;
                    case 9:
                        word = "Nine";
                        break;
                    default:
                        word = "Invalid Value";
                        break;
                }
                System.out.println(word);
                reversedNumber /= 10;
            } while (reversedNumber > 0);
            for (int i = 0; i < digitDifference; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (Math.abs(number) > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count += 1;
            number /= 10;
        } while (number > 0);
        return count;
    }
}
