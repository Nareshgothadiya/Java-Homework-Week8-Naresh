package week8javahomeworknaresh;

//8. Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class Programme8 {


    public static void main(String[] args) {
        trianglePattern();
    }
    public static void trianglePattern() {
        System.out.println("Enter the size of triangle");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int s = 1; s <= n - i; s++) ;
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("@");
                }
                System.out.println();
                scanner.close();
            }
        }
    }



