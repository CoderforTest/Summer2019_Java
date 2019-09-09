package Day10_IfStatement;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfWaterMelon;
		boolean lotsOfWaterMelon;
		lotsOfWaterMelon=false;
		
		numberOfWaterMelon=40;
		
		if(numberOfWaterMelon>=20) {
			System.out.println("I have more than 20 melons.");
			lotsOfWaterMelon=true;
		}
		
		if (lotsOfWaterMelon) {
			System.out.println("Good Job");
		}
		
		if (lotsOfWaterMelon==false) {
			System.out.println("I need more watermelon");
		}

	// Task1
	//Declare and initialize a number 
		//2) Display whether the number is an odd number or even number.

	int number=-12;
	
	if (number%2==0) {
		System.out.println("The number is even mumber.");
		}
	
	else {
		System.out.println("The number is odd number.");
	}
	
	//Task2
	//  A triangle is valid if the sum of all the three angles is equal to 180 degrees. 
	//Write a program that declares three integers as angles and check 
	//whether a triangle is valid or not.

	int angle1=1;
	int angle2=12;
	int angle3=177;
	
	if ((angle1+angle2+angle3 == 180) && (angle1>0 && angle2>0 && angle3>0)) {
		System.out.println("This is a valid triangle.");
	}
	
	else {
		System.out.println("This is not a valid triangle.");
	}

	
	/*
	  Write a Java program to implement following logic using if-else statement
1. if hour is less than 12 noon, greet with Good Morning
2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
3. if hour is greater than or equal to 3 pm, greet with Good Evening 
	 
	 */
	
	int hour = 23;
	
	if (hour>=0 && hour<12) {
		System.out.println("Good Morning");
	}
	
	else if (hour>=12 && hour<15) {
		System.out.println("Good Afternoon");
	}
	
	else if (hour>=15 && hour<=23) {
		System.out.println("Good Evening");
	}
	
	else if (hour<0 || hour>23) {
		System.out.println("Invalid Data");
		}
	
	System.out.println("================");
	
	
	/*
	 Program : • Declare 3 numbers • Program should display which one is largest
	 */

	int n1 = 2;
	int n2 = 2;
	int n3 = 30;

	if ((n1>n2) && (n1>n3)) {
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

	
	//	2. Write a Java Program for the following logic: 
	//§ If marks < 60, then print “Fail” 
	//§ If marks >= 60, but less than 90, then print “Pass” 
	//§ If marks >= 90, then print “Passed with Distinction”
	
	int mark = 92;
	
	if (mark<0 || mark >100) {
		System.out.println("invalid data");
	} else if (mark<60) {
		System.out.println("Fail");
	} else if (mark>=60 && mark<90) {
		System.out.println("Pass");
	} else if (mark>=90 && mark<=100) {
		System.out.println("Distinction");
	}
	
	//The marks obtained by a student in 3 different subjects are input by the user. 
	//Your program should calculate the average of subjects. 
	//The student gets a grade as per the following rules:

	int score1=60;
	int score2=70;
	int score3=100;
	
	int average = (score1+score2+score3)/3;
	
	if ((score1<0 || score1 >100) || (score2<0 || score2 >100) || (score3<0 || score3 >100)){
		System.out.println("invalid data");
	} else if (average>0 && average<=59) {
		System.out.println("F");
	} else if (average>60 && average<=69) {
		System.out.println("D");
	} else if (average>70 && average<=79) {
		System.out.println("C");
	} else if (average>80 && average<=89) {
		System.out.println("B");
	} else if (average>=90 && average<=100) {
		System.out.println("A");
}
}
}