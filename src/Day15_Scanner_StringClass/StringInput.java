package Day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = scan.nextLine();
		
		System.out.print("Your name is " + firstName);
		}

}
