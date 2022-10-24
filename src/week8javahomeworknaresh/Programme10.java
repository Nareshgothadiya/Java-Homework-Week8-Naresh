package week8javahomeworknaresh;

//10. Write a program to input any number and check if it Armstrong number or not
/*
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        armstrongNumber();
    }

    public static void armstrongNumber() {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        n = sc.nextInt();
        int temp = n;
        int r, sum = 0;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum)
            System.out.println(" It's an Armstrong Number ");
        else
            System.out.println(" Its Not an Armstrong Number");
        sc.close();
    }
}
