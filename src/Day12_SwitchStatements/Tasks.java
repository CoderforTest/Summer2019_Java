package Day12_SwitchStatements;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Task1: Write a program that lets user to enter apple,dell,acer laptop models
		 * If it is apple show “Apple-no virus” If it is dell show “Tough one” If it is
		 * acer show “Cheap one” Else “do not buy that one!”
		 */

		String laptop = "Acer";

		switch (laptop) {

		case "Apple":
			System.out.println("Apple-no virus");
			break;

		case "Dell":
			System.out.println("Tough one");
			break;

		case "Acer":
			System.out.println("Cheap one");
			break;

		default:
			System.out.println("Do not buy that one!");

		}

		System.out.println("===================");

		/*
		 * Task2: Write a program to display days: 1-Monday 2-Tuesday 3-Wednesday
		 * 4-Thursday 5-Friday 6-Saturday 7-Sunday
		 */

		int Day1 = 1;

		switch (2) {

		case (1):
			System.out.println("Monday");
			break;

		case (2):
			System.out.println("Tuesday");
			break;

		case (3):
			System.out.println("Wednesday");
			break;

		case (4):
			System.out.println("Thursday");
			break;

		case (5):
			System.out.println("Friday");
			break;

		case (6):
			System.out.println("Saturday");
			break;

		case (7):
			System.out.println("Sunday");
			break;

		default:
			System.out.println("There is no such day.");
			break;
		}

		System.out.println("===================");

		/*
		 * Task3: Create a new switch statement using char instead of int. § Create a
		 * new char variable § Create a switch statement testing for A, B, C, D or E §
		 * Display a message if any of these are found and then break § Add a default
		 * which displays a message saying not found.
		 */

		char A = 'A';

		switch (A) {

		case ('A'):
			System.out.println("Monday");
			break;

		case ('B'):
			System.out.println("Tuesday");
			break;

		case ('C'):
			System.out.println("Wednesday");
			break;

		case ('D'):
			System.out.println("Thursday");
			break;

		case ('E'):
			System.out.println("Friday");
			break;

		case ('F'):
			System.out.println("Saturday");
			break;

		case ('G'):
			System.out.println("Sunday");
			break;

		default:
			System.out.println("not found");
			break;

		}

		System.out.println("===================");
	}

}