package pkge01;

import java.util.Scanner;

public class Factorial_of_a_Number {
	public static void main(String[] args) {
		System.out.println("R/BCA-22-219");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}







