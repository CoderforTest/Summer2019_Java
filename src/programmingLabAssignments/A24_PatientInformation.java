package programmingLabAssignments;

import java.util.Scanner;

public class A24_PatientInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		Double height, weight;
		Boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		
		
		System.out.println("Enter your first name");
		firstName = scan.nextLine();
		
		System.out.println("Enter your last name");
		lastName = scan.nextLine();
		
		System.out.println("Enter your email");
		email = scan.nextLine();
		
		System.out.println("Enter your street");
		street = scan.nextLine();
		
		System.out.println("Enter your city");
		city = scan.nextLine();
		
		System.out.println("Enter your state");
		state = scan.nextLine();
		
		
		System.out.println("Enter your zip code");
		zipcode = scan.nextInt();
		
		System.out.println("Enter your work phone number");
		workPhoneNumber = scan.nextLong();
		
		System.out.println("Enter your personal phone number");
		personalPhoneNumber = scan.nextLong();
		
		
		System.out.println("Enter your age");
		age = scan.nextInt();
		
		System.out.println("Enter your height");
		height = scan.nextDouble();
		
		System.out.println("Enter your weight");
		weight = scan.nextDouble();

		System.out.println("Are you married?");
		isMarried = scan.nextBoolean();
		
		contacts = "work phone number - " + workPhoneNumber + ", " + "personal phone number - " + personalPhoneNumber + ", " + "email: " + email;
		fullName = lastName + ", " + firstName;
		address = street + ", " + city + ", " + state + " " + zipcode;
		
		System.out.println("Patient personal information" + "\n" + "Full name: " + fullName + "\n" + "Address: " + address + "\n" + "Contacts: " + contacts + "\n" +
				"Age: " + age + "\n" + "Height: " + height+ "\n" + "Weight: " + weight + " pounds" + "\n" + "Married?: " + isMarried);

			
			
		/*

Execution flow with example


-Display prompt "Enter your first name"
James

-Display prompt "Enter your last name"
May

-Display prompt "Enter your email"
jamesmay@gmail.com

-Display prompt "Enter your street"
7925 Jones Branch Dr

-Display prompt "Enter your city"
McLean

-Display prompt "Enter your state"
VA

-Display prompt "Enter your zip code"
22102

-Display prompt "Enter your work phone number"
7896542314

-Display prompt "Enter your personal phone number"
2406542314

-Display prompt "Enter your age"
35

-Display prompt "Enter your height"
5.10

-Display prompt "Enter your weight"
173.2

-Display prompt "Are you married?"
true



-build contacts variable by concatenating work phone, personal phone and email
-build fullName variable by concatenating first name and last name
-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true
		 */
	}

}
