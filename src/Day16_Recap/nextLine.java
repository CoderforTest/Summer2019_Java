package Day16_Recap;

import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your phone number");
		
		int phonenum = scan.nextInt();
		
		
		System.out.println("Enter your name");
		scan.nextLine();
		String name = scan.nextLine(); // nextLine method accepts "enter". you can enter value only once.
	//	String name = scan.next(); ignores enter

	
	
	System.out.println("Enter your phone number");
	int pn = scan.nextInt();
	System.out.println(pn);
	
	
	}

}
