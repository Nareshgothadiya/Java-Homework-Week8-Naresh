package week8javahomeworknaresh;

/*5. Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.*/

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();

        // public static boolean isPalindrome(int num) {
        int org_num = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(num);
        System.out.println(reverse);

        if (org_num == reverse) {

            System.out.println(org_num + "  is Palindrome Number");
        } else {
            System.out.println(org_num + "  is Not Palindrome Number");
            scanner.close();
        }

    }
}


/*
 Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        int backup = num;
        int org_num = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
           if (backup == reverse) {

            System.out.println(org_num + "  is Palindrome Number");
        } else {
            System.out.println(org_num + "  is Not Palindrome Number");
        }

    }
}

 */