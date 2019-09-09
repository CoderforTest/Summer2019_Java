package Day15_Scanner_StringClass;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * write a program that can calculate sum of two numbers.
 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		int a = scan.nextInt();
		
		System.out.println("Enter second value: ");
		int b = scan.nextInt();
		
		System.out.println("Sum of two numbers is: " + (a+b));

	}

}
