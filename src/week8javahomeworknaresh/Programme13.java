package week8javahomeworknaresh;

/*
13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit
 */
public class Programme13 {

    public static void main(String[] args) {
        boolean num = hasSharedDigit(12, 23);
        System.out.println(num);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        int lastdigit1 = 0;
        int lastdigit2 = 0;
        int value = num2;
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {

            while (num1 > 0) {
                lastdigit1 = num1 % 10;
                System.out.println("Number 1 last Digit; " + lastdigit1);

                do {
                    lastdigit2 = num1 % 10;
                    System.out.println("Number 2 last Digit; " + lastdigit2);
                    if (lastdigit1 == lastdigit2) {
                        return true;
                    } else {
                        num2 %= 10;
                    }
                } while (num2 > 0);
                num2 = value;
                num1 %= 10;
            }
        }
        return false;
    }
}
