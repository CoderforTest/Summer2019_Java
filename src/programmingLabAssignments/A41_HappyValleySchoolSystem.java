package programmingLabAssignments;

import java.util.Scanner;

public class A41_HappyValleySchoolSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age = scan.nextInt();
		
		
		
		
		if (age>=2 && age<=18) {
			
			if (age>=2 && age<3) {
			System.out.println("toddler");
			}
	
			else if (age>=3 && age<=5) {
			System.out.println("early childhood");
			}
	
			else if (age>=6 && age<=7) {
				System.out.println("young reader");
				}
		
			else if (age>=8 && age<=10) {
				System.out.println("elementary");
				}
		
			else if (age>=11 && age<=12) {
				System.out.println("middle");
				}
				
			else if (age>=13 && age<14) {
				System.out.println("impossible");
				}
		
			else if (age>=14 && age<=16) {
				System.out.println("high school");
				}
		
			else {
				System.out.println("scholar");
				}
	}
			
			
			else {
			System.out.println("ineligible");
			}
				
	
	}

}
/*
In the Happy Valley School System, children are classified by age as follows:

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

Given an int variable age, write an if statement that prints out, on a line by itself, the appropriate label from the above list based on age.

Example:
-Display prompt: Enter age:
8
*/