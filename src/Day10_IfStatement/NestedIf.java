package Day10_IfStatement;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Nested if: if inside another if
		 if (condition1){
		 	// A as long as condition1 is true.
		 	if(condition2) {
		 		//some code to run. if both condition1 and condition 2 are true.
		 }
		 }
		 */

		if (true) {
			System.out.println("Hi");
		}		
			if (true) {
				System.out.println("Hello World");
			}
			else { 
				System.out.println("cybertek");
			}
			
		
		int grade=65;
		
		if (grade>100 || grade<0) {
			System.out.println("invalid data");
		}
		
		if(grade>=60 && grade<=100);
		System.out.println("you passed");
			
			if(grade>=90 && grade<=100) {
			System.out.println("\twith a grade of A");
			}
		
			else if(grade>=80 && grade<90) {
			System.out.println("\twith a grade of B");
			}
	
			else if(grade>=70 && grade<80) {
			System.out.println("\twith a grade of C");
			}
		
			else if(grade>=60 && grade<70) {
			System.out.println("\twith a grade of D");
			}
		
		
		else {
			System.out.println("failed");
		}
	
		}

	}

