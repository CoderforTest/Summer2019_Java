package Day12_SwitchStatements;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * declare 3 numbers if n1 and n2 are equal n1&n2 are equal if n2 and n3 are
		 * equal n2&n3 are equal if n1 and n3 are equal n1&n3 are equal if n1 and n2 and
		 * n3 are equal n1&n2&n3 are equal if none of them are equal none of them are
		 * equal
		 * 
		 */

		int n1, n2, n3;
		n1 = 41;
		n2 = 4;
		n3 = 421;

		if (n1 == n2 && n1 != n3) {
			System.out.println("n1 and n2 are equal.");
		}

		else if (n2 == n3 && n2 != n1) {
			System.out.println("n2 and n3 are equal.");
		}

		else if (n1 == n3 && n1 != n2) {
			System.out.println("n1 and n3 are equal.");
		}

		else if (n1 == n2 && n1 == n3 && n2 == n3) {
			System.out.println("They are all equal.");
		}

		else {
			System.out.println("None of them are equal.");
		}

		System.out.println("=======================");
		// 2nd solution. wrong solution.

		int n11 = 15;
		int n22 = 15;
		int n33 = 15;

		if (n11 == n22 && n11 == n33 && n22 == n33) {
			System.out.println("all equal.");
		}

		if ((n11 == n22) & (n11 != n33)) {
			System.out.println("n11 and n22 are equal.");
		}

		if (n22 == n33 & n22 != n11) {
			System.out.println("n22 and n33 are equal.");
		}

		if (n11 == n33 & n11 != n22) {
			System.out.println("n11 and n33 are equal.");
		}

		else {
			System.out.println("none of them are equal.");
		}
		System.out.println("=======================");

		// 3rd solution. nested if

		int A = 15;
		int B = 151;
		int C = 11;

		if (A == B && A == C && B == C) {
			System.out.println("all are equal.");
		}

		else // if they are not all equal
			if (A == B) {
				System.out.println("A and B are equal.");
			}
	
			else if (A == C) {
				System.out.println("A and C are equal.");
			}
	
			else if (B == C) {
				System.out.println("B and C are equal.");
			}
	
			else {
				System.out.println("none of them are equal.");
			}

		System.out.println("=======================");

		int grade = 101;

		if (grade >= 60 && grade <= 100) {

			if (grade >= 90 && grade <= 100) {
				System.out.println("grade is A");
			}

			else if (grade >= 80 && grade < 90) {
				System.out.println("grade is B");
			}

			else if (grade >= 70 && grade < 80) {
				System.out.println("grade is C");
			}

			else {
				System.out.println("grade is D");
			}
		} // closing curly brace of the first if statement. very important.

		else if (grade >= 0 && grade < 60) {
			System.out.println("Failed.");
		}

		else {
			System.out.println("invalid entry");
		}

	}
}