package Day15_Scanner_StringClass;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DEclare a variable num
		//write a java program that can convert numbers between 0 to 9 to words.
		//if the number is greater than 9 or less than zero. output should be "Invalid".

	int num = 7;
	
	switch (num) {
	
	case 0:
	System.out.println("zero");
	break;
	
	case 1:
		System.out.println("one");
		break;
		
	case 2:
		System.out.println("two");
		break;
		
	case 3:
		System.out.println("three");
		break;
		
	case 4:
		System.out.println("four");
		break;
		
	case 5:
		System.out.println("five");
		break;
		
	case 6:
		System.out.println("six");
		break;
		
	case 7:
		System.out.println("seven");
		break;
		
	case 8:
		System.out.println("eight");
		break;
		
	case 9:
		System.out.println("nine");
		break;
		
	default:
		System.out.println("Invalid");
		break;
		
	}
	
	System.out.println("==================");
	
	// 2nd solution
	
	int n = 11;
	String result = "";
	
	if (n>=0 && n<=9) {
		
		if(n==9)
			result = "nine";
		if(n==8)
			result = "eight";
		if(n==7)
			result = "seven";
		if(n==6)
			result = "six";
		if(n==5)
			result = "five";
		if(n==4)
			result = "four";
		if(n==3)
			result = "three";
		if(n==2)
			result = "two";
		if(n==1)
			result = "one";
		if(n==0)
			result = "zero";
	}
	
	else
		result = "Invalid";
	

	System.out.println(result);
	
System.out.println("===========");

int nn = 6;

String res = (nn==9) ? "nine" 
		: (nn==8) ? "eight"
				: (nn==7) ? "seven" 
						: (nn==6) ? "six" 
								: (nn==5) ? "five" 
										: (nn==4) ? "four"
												: (nn==3) ? "three"
														: (nn==2) ? "two" 
																: (nn==1) ? "one" 
																		: (nn==0) ? "zero"
																				:"Invalid";																				
System.out.println(res);

}
}