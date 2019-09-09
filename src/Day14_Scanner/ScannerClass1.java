package Day14_Scanner;

import java.util.Scanner; 

//this imports Scanner class only from java.util package

import java.util.*; 

//this imports all the class from Java.util package
//everything in scanner class is imported
public class ScannerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);  // declaration

		System.out.println("Enter a Byte Value");

			byte num1 =	scan.nextByte(); 

				// only allows user to enter byte value

	System.out.println("You have entered: "+num1);

	System.out.println("Enter another Byte Value");

		byte num2 = scan.nextByte();

		

		System.out.println("You have entered: "+num2);

		

System.out.println("Addition is: "+ (num1 + num2) );
	}

}
