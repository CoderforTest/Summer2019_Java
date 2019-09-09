package Day15_Scanner_StringClass;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 write a program that asks user to enter three numbers and returns the largest number.
		 Do it with ternary.
		 */
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter num1");		
		double num1 = scan.nextDouble();
		
		System.out.println("Enter num2");		
		double num2 = scan.nextDouble();
		
		System.out.println("Enter num3");		
		double num3 = scan.nextDouble();
		
		double Largest = (num1>num2 && num1>num3) ? num1
				: (num2>num1 && num2>num3) ? num2
						: num3;
		
		System.out.println("Largest number is " + Largest);
						
			/*
			or
			
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter three numbers");		
		
		double num1 = scan.nextDouble();	
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		double Largest = (num1>num2 && num1>num3) ? num1
				: (num2>num1 && num2>num3) ? num2
						: num3;
		
		System.out.println("Largest number is " + Largest);			
			 */
		
		
	}

}
