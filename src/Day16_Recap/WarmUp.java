package Day16_Recap;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
		// write a java program that asks user to enter first and last names, then printout the users full name in all capital letters.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		
		String firstName = scan.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastName = scan.nextLine();
		
		String fullName = firstName + " " + lastName;
		
		String fullNameCapital = fullName.toUpperCase();
		
		System.out.println("Your full name is " + fullNameCapital);
		
		
		
		
	}

}
