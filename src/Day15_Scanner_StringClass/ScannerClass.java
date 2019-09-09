package Day15_Scanner_StringClass;

import java.util.Scanner;
// we need to import between package and class
// package name : java.util
// class name: Scanner
// Scanner class is presented in "java.util" package

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Topics:
		// Scanner class
		//String class & String manipulations

/*
 wild import:
 import java.util.*;
 imports all the classes within "java.util" package.
 import java.util.Scanner; imports only Scanner class from "java.util".
 

		// declaration of scanner class
		// Scanner variableName = new Scanner(System.in);
		//new Scanner(System.in); creates an object from the scanner class.
		
		Scanner scan = new Scanner(System.in); // memorize it!
		scan.nextByte(); returns the user a Byte value.
		// new is for creating object.
		
	Scanner methods:
		
		variableName.nextByte();
		
		
		
		
		*/
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a value: ");
	byte num = scan.nextByte();
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter another value: ");
	int n = input.nextInt();
	
	
	Scanner car = new Scanner(System.in);
	
	System.out.print("Enter third value: ");
	int nn = car.nextInt();
	
	System.out.print("The total value is: " + (num + n + nn));

	
	
	
	}

}
