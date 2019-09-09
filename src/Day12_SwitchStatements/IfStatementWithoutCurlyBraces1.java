package Day12_SwitchStatements;

public class IfStatementWithoutCurlyBraces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(true) {

			System.out.println("Hello");

			System.out.println("Hello");

		}else {

			System.out.println("Wolrd");

		}

		

		

		// without curly brace: a single line of statement

		if(true) 

			System.out.println("Hello");

	//		System.out.println("Hello");   

//without culy brace if block cannot hold more than one statement

		else 

			System.out.println("World");

			

		

		if(true) {

			if(true) {

				System.out.println("Hello World");

			}

			else {

				System.out.println("Hello cybertek");

			}

		}

		else {

			System.out.println("Invalid");

		}

		

		System.out.println("=====================");

		// nested if: 

	

		if(true)

			if(true) System.out.println("Hello World");

			else  System.out.println("Hello cybertek");

		else System.out.println("Invalid");

	

	

		

		// multi-branch if:

		int grade =60;

		if( grade <= 100 && grade >= 0) {

			if(grade >= 90) {

				System.out.println("A");

			}

			else if(grade >= 80) {

				System.out.println("B");

			} 

			else if(grade >=70) {

				System.out.println("C");

			}
			
			else {
				System.out.println("D");
			}

		}

		else {

			System.out.println("Invalid Entry");

		}

		

		

		

	if(grade <= 100 && grade >= 0)	

		if(grade >= 90) 

			System.out.println("A");		

		else if (grade >= 80)

			System.out.println("B");

		else if (grade >=70) 

			System.out.println("C");

		else // this else statement belongs to the "else-if statements

			System.out.println("D"); 

	else  // this else statement belongs to the pre condition

		System.out.println("Invalid");

	}

	}