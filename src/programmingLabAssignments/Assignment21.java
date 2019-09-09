package programmingLabAssignments;

import java.util.Scanner;

public class Assignment21 {

	public static void main(String[] args) {
    //WRITE YOUR CODE HERE:
    
	  /* In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"

	   */
    Scanner scan = new Scanner(System.in);
    
    int num1, num2, num3, sum;
    num1=1;
    num2=2;
    num3=3;
    
    
    System.out.println("Enter 3 numbers:");
    
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();
    
    sum=num1+num2+num3;
    int ValueOfSum = sum;
    
    System.out.println("Sum of numbers: " + ValueOfSum);
    
    
    
  }
}