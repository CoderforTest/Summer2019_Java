package Day12_SwitchStatements;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * whenever you write code. if some variable equals to some different value.
		 * switch statement is similar to else if statement.
		 * 
		 * switch(Expression){ // expression is not boolean type. it is data type. case
		 * caseValue: statement1 statement2 . . . break;
		 * 
		 */

		int score = 2;

		/*
		 * if(score==1) { System.out.println("1"); } else if(score==2) {
		 * System.out.println("2"); }
		 */

		switch (score) { // must pass a data. not boolean expression.
		case 1:
			System.out.println("1");
			break;

		case 2:
			System.out.println("2");
			break;

		case 27:
			System.out.println("27");
			break;

		default:
			System.out.println("invalid");
			break;
		}

		String str = "Java";

		switch (str) {

		case "Java":
			System.out.println("I like Java");
			break;

		case "c#":
			System.out.println("Good programming language");

		default:
			System.out.println("Invalid");
			break;
		}

		char grade = 'A';

		switch (grade) {

		default:
			System.out.println("failed");
			break;
			
		case 'B':
			System.out.println("B");
			break;

		case 'C':
			System.out.println("C");
			break;

		}
	}
}
