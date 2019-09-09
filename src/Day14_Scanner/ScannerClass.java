package Day14_Scanner;

import java.util.Scanner; // this imports all the class from java.util package.

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	Scanner is a class that provides the methods to get user inputs.
	Scanner class is presented in package of "java.util".
	in order to use scanner class, it must be imported to your class:
		import java.util.Scanner;
		
		the import statement must be placed between package and className.
	
	
	Declaration of scanner:
	
	Scanner VariableName = new Scanner(System.in);
	VariableName can refer to an object of the scanner class.
	new Scanner(System.in) : creates the object of the scanner class.
	
	
 */
	
	Scanner deger = new Scanner(System.in); // declaration of scanner
	System.out.print("Enter a Byte Value: ");
	byte byteNum = deger.nextByte(); // allows user to enter only byte value.
	
	
	System.out.println("You have entered " + byteNum);
	
	System.out.print("Enter another Byte Value: ");
	byte byteNum2 = deger.nextByte();
	
	System.out.println("You have entered " + byteNum2);
	
	System.out.println("Addition is " + (byteNum + byteNum2));
	}

}
