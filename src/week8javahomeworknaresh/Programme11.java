package week8javahomeworknaresh;
/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */

import java.util.Scanner;

public class Programme11 {
    public static void main(String[] args) {
        getEvenDigitSum();
    }

    public static void getEvenDigitSum() {
        int num;
        int rem;
        int sum = 0;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number range ");
        num = sc.nextInt();
        n = num;
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 == 0) {
                sum = sum + rem;

            }
            num = num / 10;
        }
        System.out.println("Sum of Even Number in " + n + "  is " + sum);
        sc.close();
    }
}


//    public static void getEvenDigitSum(int n) {
//        int i, sum = 0;
//        System.out.println("Enter number range ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//        {
//            for (i = 0; i <= n; i++) {
//                if (n % 2 == 0) {
//                    sum = sum + i;
//                    //  }
//                    System.out.println("Sum of Even Number is " + i);
//                } else {
//                    for (i = 1; i <= n; i = i + 2) {
//                        sum = sum + 1;
//                    }
//                    System.out.println("Sum of Even Number " + sum);
//                }
//            }
//        }
//
//    }}