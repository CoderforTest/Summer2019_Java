package Day11_IfStatementReview;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1. declare an int variable "Year"
		 write a java program that can check if the year is a leap year
		 leap year==> if a year is divided by 4. it has 366 days.
	
		 
	
		 2. Grade calculator:
		 A==> 90~100
		 B==> 80~89
		 C==> 70~79
		 D==> 60~69
		 F==> <0~59
		 */
	
		int Year = 2000;
		boolean LeapYear = Year%4==0;

		if(LeapYear) {
			System.out.println("Year " + Year + " is a leap year.");
		}
		else {
			System.out.println("Year " + Year + " is not a leap year.");
		}
		
		System.out.println("===============");
		
	int Grade = 92;
	
	if (Grade>=60 && Grade<=100) {
	
		if (Grade>=60 && Grade<=69){
			System.out.println("Grade is D");
			}
		else if (Grade>=70 && Grade<=79){
			System.out.println("Grade is C");
			}
		else if (Grade>=80 && Grade<=89){
			System.out.println("Grade is B");
			}
		else {
			System.out.println("Grade is A");
			}
		}
	
	else if (Grade>=0 && Grade<=59) {
		System.out.println("You failed.");
	}
	
	else {
		System.out.println("invalid data");
	}
	
	
	
	System.out.println("======================");
	/*
	 declare a variable called Age
	 declare a boolean variable "GoodPerson"
	 age>=18 ==> cigarette
	 age >=21 ==> Hookah
	 age>= 25 ==> alcohol
	 age <18 ==> milk
	 */
	
	int age = 0;
	boolean GoodPerson = age>=0 && age<18;
	
	
	if (GoodPerson) {
		System.out.println("Buy milk.");
	}	
	
	else if (age>=18 && age<=150){
		
		if (age>=18 && age<21) {
			System.out.println("You can buy cigarette");
		}
		else if (age>=21 && age<25) {
			System.out.println("You can smoke Hookah");
		}
				
		else if (age>=25 && age<=150){
			System.out.println("You can buy alcohol");
		}
	}
	
	else {
		System.out.println("Invalid data");
	}
	
	
	System.out.println("=========================");
	/* 
	 write a program that can find number of days in a month. Assume that feb has 28 days.
	 int month=0~12; use nested if
	 */
	
	int year = 2000;
	boolean leapyear = year%4==0;
	
	int month = 2;
	
	int numberofdays1 = 28;
	
	int numberofdays11 = 29;
	
	int numberofdays2 = 30;
	int numberofdays3 = 31;
	
	
	if (leapyear) {
		System.out.println("February. It has " + numberofdays11 + " days.");
		}
	
	else if (month==2) {
		System.out.println("February. It has " + numberofdays1 + " days.");
		}
	
	else if (month==4 || month==6 || month==9 || month==11) {
		
		if (month==4) {
			System.out.println("April. It has " + numberofdays2 + " days.");
		}
		else if (month==6) {
			System.out.println("June. It has " + numberofdays2 + " days.");
		}
		else if (month==9) {
			System.out.println("September. It has " + numberofdays2 + " days.");
		}
		else {
			System.out.println("November. It has " + numberofdays2 + " days.");
		}	
	}
		
	else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
		
		if (month==1) {
			System.out.println("January. It has " + numberofdays3 + " days.");
		}
		else if (month==3) {
			System.out.println("March. It has " + numberofdays3 + " days.");
		}
		else if (month==5) {
			System.out.println("May. It has " + numberofdays3 + " days.");
		}
		else if (month==7) {
			System.out.println("July. It has " + numberofdays3 + " days.");
		}
		else if (month==8) {
			System.out.println("August. It has " + numberofdays3 + " days.");
		}
		else if (month==10) {
			System.out.println("October. It has " + numberofdays3 + " days.");
		}
		else {
			System.out.println("December. It has " + numberofdays3 + " days.");
		}
	}
	
	else { // if (month<1 || month>12) 
		System.out.println("Invalid entry");
	}
	
	
	System.out.println("========================");
	
	
	// if-else && else-if
	
	if (true) {
		System.out.println("Hello");
	} else {
		System.out.println("Batch 12");
			}
	
	
	if (false) {
	System.out.println("Hi");
	} 
	
	else if (true) {
		System.out.println("Batch12");
	}
	else 
	{
	System.out.println("Cybertek");
			}
	
	
	int x=10;
	
	if(x>0) {
		System.out.println("greater than 0");
	}
	else if(x>5) {
		System.out.println("greater than 5");
	}
	else if(x==10) {
		System.out.println("equals 0");
	}
	
	
	
	if (true) { // if the condition has multiple scenarios. if we have precondition. this is the precondition.
		
		if (true) {
			// execution of this block depends on the first condition.
			
		}
		
	}
	}
	}
	