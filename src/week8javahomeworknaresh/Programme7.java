package week8javahomeworknaresh;

/*
7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {
        sumFirstAndLastDigit();

    }

    public static void sumFirstAndLastDigit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;

        }
        System.out.println("First Digit = " + firstDigit);
        System.out.println("Last Digit = " + lastDigit);
        System.out.println("sumFirstAndLastDigit = " + (firstDigit + lastDigit));
        scanner.close();
    }

}

