package programmingLabAssignments;

import java.util.Scanner;

public class A62_PrintFirstandLastLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		 int a = word.length();
		 
		 System.out.println(word.charAt(0) + "" + word.charAt(a-1));
		    
	}

}
/*
Write a program that will print out first and last letters together.
*/