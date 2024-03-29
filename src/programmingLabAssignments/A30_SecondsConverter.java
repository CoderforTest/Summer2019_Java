package programmingLabAssignments;

import java.util.Scanner;

public class A30_SecondsConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds. 

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
		 */

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter seconds:");
	
	int inputSeconds = input.nextInt();
	int hours = 1;
	int minutes = 2;
	int seconds = 3;
		
	hours = inputSeconds/3600;
	minutes = (inputSeconds - hours*3600)/60;
	seconds = (inputSeconds - minutes*60)%60;
	
	System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	
	}

}
