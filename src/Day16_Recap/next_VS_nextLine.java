package Day16_Recap;

import java.util.Scanner;

public class next_VS_nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
			String f = scan.next(); // takes only one word at a time. scan.nextLine() takes whole statement/sentence.
			
		System.out.println("Enter your last name");
		String L = scan.next();
		
		System.out.println("Your first name is " + f);
		System.out.println("Your last name is " + L);
		
				
	}

}
