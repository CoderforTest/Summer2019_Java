package Day14_Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		
		if(true) {
			num=100;
		} else {
			num=50;
		}
		
		System.out.println(num);

		System.out.println("============");
		
	int n = (true) ? 80 : 40; //same expression as above, shorter version. ternary returns a Value.
	
	System.out.println(n);
	
	/*
	 in ternary first you give condition and question mark.
	 if(Condition)      ==> (Condition)?
	 else               ==> :
	 else if(Condition) ==> :(Condition)?
	 
	 in ternary body we can only give single value.
	 ternary must be initialized to a variable, and MUST return a value.
	 We cannot use ternary for single if statement.
	 */
	
	
	int y = false ? 70:30;
	System.out.println(y);
	
	String Schoolname = "";
	boolean Batch12 = true;
	
	if(Batch12) {
		Schoolname = "Cybertek";
	} else {
		Schoolname = "Invalid";
	}
	
	
	System.out.println(Batch12 ? "Cybertek" : "Invalid");
	
	String BestSchool = Batch12 ? "Cybertek" : "Invalid";
	
	System.out.println(BestSchool);
	
	double d =20;
	if(true) {
		d=10.5;
		
	}
	
	double z = true ? 10.5 : 0;
	System.out.println(z);
	
	
	double interestRate=0;
	boolean GoodCredit = true;
	
	interestRate = (GoodCredit==true) ? 0.5 : 0.9;
	
	System.out.println(interestRate);
	
	
	byte grade=60;
	boolean Passed = grade>=60 ? true : false;
	System.out.println(Passed);
	
	// else if statement 
	
	
	char FinalGrade='A';
	String Group="";
	
	if(FinalGrade == 'A') {
		Group="Early bird";
	} else if(FinalGrade == 'B'){
		Group="Group1";
	} else if(FinalGrade == 'C'){
		Group="Group2";
	} else {
		Group = "After Group 2";
	}

	Group = (FinalGrade == 'A') ? "Early bird" 
			: (FinalGrade == 'B') ? "Group 1" 
					: (FinalGrade == 'C') ? "Group2" 
							: "After Group2";
	
Group = (FinalGrade == 'A') ? "Early bird" : (FinalGrade=='B') ? "Group1" : "After Group 1";
System.out.println(Group);


int score = 11;
char Finals = ' ';

if (score >= 90 && score <= 100)
	Finals = 'A';

else if (score >= 80 && score <= 89)
	Finals = 'B';

else if (score >= 70 && score <= 79)
	Finals = 'C';

else if (score >= 60 && score <= 69)
	Finals = 'D';

else if (score >= 0 && score <= 59)
	Finals = 'F';

else
	Finals = ' ';


Finals = (score >= 90 && score <= 100) ? 'A' 
		: (score >= 80 && score <= 89) ? 'B'
			: (score >= 70 && score <= 79) ? 'C'
				: (score >= 60 && score <= 69) ? 'D'
					: (score >=0 && score <= 59) ? 'F'
						: '?';
								
		System.out.println(Finals);				
	
		int n1=10000, n2=3000, n3=400;
		
		int max = (n1>n2 && n1>n3) ? n1
				: (n2>n1 && n2>n3) ? n2
						: n3;

	System.out.println(max);
	}
}