package Day16_Recap;

import java.util.Scanner;

public class nextLine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 write a program that accepts zip code, city, state, phone number 
		 and display all gathered info on console.
		 Do not use next() method
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your zip code");
		
		int zipcode = scan.nextInt();
		// 1223 Enter
		scan.nextLine();
		
		System.out.println("Please enter your city name");
		String city = scan.nextLine();
		
		System.out.println("zipcode is " + zipcode);
		System.out.println("city is " + city);
	}

}
