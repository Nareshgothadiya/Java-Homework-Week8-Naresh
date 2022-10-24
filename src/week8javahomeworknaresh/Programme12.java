package week8javahomeworknaresh;

//Write a programme to input any number and check if it is prime or not.

import java.util.Scanner;

public class Programme12 {

    public static void main(String[] args) {
        System.out.println("Enter Any Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Programme12 obj = new Programme12();
        obj.PrimeOrNot(n);
        sc.close();
    }

    public void PrimeOrNot(int n) {
        int count = 0;
        if (n <= 1) {
            System.out.println("The number is not prime : ");
            return;
        }

        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println(+n + " is not Prime Number");

        } else {
            System.out.println(+n + " is Prime Number");
        }
    }
}
