package week8javahomeworknaresh;

//2. -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 10 numbers");
        int n = scanner.nextInt();
        int max = n;
        int min = n;
        for (int i = 2; i <= 10; i++) {
            n = scanner.nextInt();
            if (max < n)
                max = n;
            if (min > n)
                min = n;
        }

        System.out.println("Maximum Value is = " + max);
        System.out.println("Minimum Value is = " + min);
        scanner.close();
    }

}

//        int main () {
//            int num = 1, max = 1, min = 1;
//            int counter = 0;
//            while (num != 0) {
//                if (counter == 0) {
//                    max = num;
//                    min = num;
//                } else if (num != 0) {
//                    if (num > max)
//                        max = num;
//                    else if (num < min)
//                        min = num;
//                }
//                counter++;
//            }
//        }
//    }
//}

