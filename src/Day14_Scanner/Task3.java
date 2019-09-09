package Day14_Scanner;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Write a program that asks user to enter first name and then last name.  At the end system should display user’s full name.

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your first name: ");
	String firstName = scan.next();
	
	System.out.println("Enter your last name");
	String lastName = scan.next();
	
	System.out.println("Name: " + firstName + " " + lastName);
	
	}

}
