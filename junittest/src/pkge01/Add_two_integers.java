package pkge01;

import java.util.Scanner;

public class Add_two_integers {
	
	    public static void main(String[] args) {
	    	System.out.println("R/BCA-22-219");
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first integer:");
	        int num1 = scanner.nextInt();

	        System.out.println("Enter the second integer:");
	        int num2 = scanner.nextInt();

	        int sum = num1 + num2;

	        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	        

	    }

		public static int add(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1+num2;
		}
}
