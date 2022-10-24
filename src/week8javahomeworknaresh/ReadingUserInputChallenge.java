package week8javahomeworknaresh;

//1. Read 10 numbers from the console entered by the user and print the sum of those numbers.

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any 10 numbers, for example, from 1 to any!");

        int number = 0;
        int total = 0;
        int counter = 0;

        while (counter < 10) {
            System.out.println("Enter number :" + (counter + 1));
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                counter++;
                total += number;
            } else {
                System.out.println("Invalid Input! Try again!");
            }
        }
        System.out.println("The total sum is " + total);
        scanner.close();
    }

}

