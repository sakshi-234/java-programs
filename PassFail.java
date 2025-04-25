package assignment;

import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting marks for the first subject
        System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();

        // Accepting marks for the second subject
        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();

        // Closing the scanner as it's no longer needed
        scanner.close();

        // Checking if the candidate has passed or failed
        if (marks1 >= 40 && marks2 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
