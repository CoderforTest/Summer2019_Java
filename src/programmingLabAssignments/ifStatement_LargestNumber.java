package programmingLabAssignments;

import java.util.Scanner;

public class ifStatement_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 		in this problem you need to write a program that checks for the bigger of 3 numbers.

		you get 3 int variables: n1 , n2 and n3

		if n1 is biggest output: "n1 is bigger"
		if n2 is biggest output: "n2 is bigger"
		if n4 is biggest output: "n3 is bigger"


		for example:

		n1 = 1
		n2  = 2
		n3  = 1

		output: "n2 is bigger"

n1 = 3
n2  = 2
n3  = 1

output: "n1 is bigger"

n1 = 3
n2  = 2
n3  = 30

output: "n3 is bigger"

hint: this can be done with 3 ifs and && operator (and operator). 

like: if n1>2 and n1>3
	
	*/
	
		Scanner scan = new Scanner(System.in);
		
		int n1=1;
		int n2=2;
		int n3=3;
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("n1 is bigger");
		}
		else if (n2>n1 && n2>n3) {
			System.out.println("n2 is bigger");
		}
		else {
			System.out.println("n3 is bigger");
		}
		
	}

}
