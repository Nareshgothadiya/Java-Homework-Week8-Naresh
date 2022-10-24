package week8javahomeworknaresh;
/*3. Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant*/

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {

        char ch;
        System.out.println("Enter any Character ");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Input Letter is Vowel");
        } else {
            System.out.println("Input Letter is Consonant");
            scanner.close();
        }
    }
}
