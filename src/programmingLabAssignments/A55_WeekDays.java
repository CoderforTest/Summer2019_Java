package programmingLabAssignments;

import java.util.Scanner;

public class A55_WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int dn = scan.nextInt();
		
		switch (dn){
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("Invalid number!");
			break;
		
	
		}
	}

}
/*
Write a program that will print a week day according to the day number. Use switch statement. 
Example
Display message: "Enter number:"
1
Display message: "Monday"
*/