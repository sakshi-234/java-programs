package assignment;

import java.util.Scanner;

public class MultiplyDivide {

    public static int multiply(int a, int b) {
        int result = 0;
        boolean isNegative = false;

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            isNegative = true;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return isNegative ? -result : result;
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        int quotient = 0;
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Multiplication Result: " + multiply(num1, num2));

        try {
            System.out.println("Division Result: " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
