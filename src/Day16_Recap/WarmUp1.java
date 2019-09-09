package Day16_Recap;
import java.util.Scanner;  // imports one class

public class WarmUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// import java.util.*; // imports all classes from java.util

			/*

			 write a java program that asks user to enter first and 

			 last names, then printout the user's full name in all 

			 capital letters.

			 */

				Scanner scan = new Scanner(System.in);

				System.out.println("Enter your first name and lastname");

				String firstname = scan.nextLine(),

						lastname = scan.nextLine();

			String fullname = firstname.concat(" "+lastname).toUpperCase();

				System.out.println("your full name is: "+fullname);
				System.out.println(firstname);

	}

}