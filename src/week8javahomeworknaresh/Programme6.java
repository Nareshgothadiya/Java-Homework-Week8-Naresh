package week8javahomeworknaresh;

//6. Write a program in Java to display the pattern like a triangle with a number.
//For eg.
//Input number of rows:

import java.util.Scanner;

public class Programme6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int n = sc.nextInt();

        triangle(n);
        sc.close();
    }

    public static void triangle(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}