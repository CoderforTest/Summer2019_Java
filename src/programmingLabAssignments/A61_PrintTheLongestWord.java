package programmingLabAssignments;

import java.util.Scanner;

public class A61_PrintTheLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    
		String a = word1.length() > word2.length() ? word1 : word2;
		    
		    System.out.println(a);
	}

}
/*
Write a program that will print out the longest word.
*/