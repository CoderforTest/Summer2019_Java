package Day15_Scanner_StringClass;
import java.util.Scanner;

public class Task031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*

					Write a program that asks user to enter first name 

					and then last name.  At the end system should display user’ 

					full name.



				 */

				Scanner input = new Scanner(System.in);

				System.out.println("Enter your first name: ");

				 	String firstName = input.next();

				 	

			 	System.out.println("Enter your LastName: ");

			 	String lastName = input.next();

			 	

			 	String fullname =lastName+" "+firstName;

			 	

			 System.out.println("Your full name is: "+fullname);


			 	input.close(); // gets rid of warning of the scanner class				
	}

}
