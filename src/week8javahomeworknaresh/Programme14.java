package week8javahomeworknaresh;

//Write a program in Java to display the pattern like a diamond.
//While loop

import java.util.Scanner;

public class Programme14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for rows: ");
        int n = sc.nextInt();
        diamondShape(n);
        sc.close();
    }

    public static void diamondShape(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;

            while (j++ <= n - i) {
                System.out.print(" ");
            }
            int k = 1;
            while (k++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println("");
            i++;
        }
        i = n - 1;
        while (i > 0) {
            int j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            int k = 1;
            while (k++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}