package assignments;

public class Task03_BiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
write a program that checks for the bigger of 3 numbers.

you get 3 int variables: n1 , n2 and n3

if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"

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
		 */

		int n1 = 2;
		int n2 = 3;
		int n3 = 3;
		
		if (n1>n2 && n1>n3) {
		System.out.println("n1 is the biggest.");
		}

		else if (n2>n1 && n2>n3) {
		System.out.println("n2 is the biggest.");
		}
		
		else if (n3>n1 && n3>n2) {
		System.out.println("n3 is the biggest.");
			}

		else if (n3==n2 && n3>n1) {
			System.out.println("n2 and n3 are bigger numbers.");
}

		else if (n3==n1 && n3>n2) {
			System.out.println("n1 and n3 are bigger numbers.");

}

		else if (n2==n1 && n2>n3) {
			System.out.println("n1 and n2 are bigger numbers.");
}

		else {
			System.out.println("All of them are equal.");
		}
}
}
