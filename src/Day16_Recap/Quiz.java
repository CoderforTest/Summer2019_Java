package Day16_Recap;

public class Quiz {

	public static void main(String[] args) {
		
	int x =5, y=19;
	int num = y-x > x-y ? y-x : x-y;
	System.out.println(num);
			
	String OPT = "true";
	switch (OPT) {
	case "true": // not boolean, it is string
		System.out.println("One");
		break;
		
	default:
		System.out.println("Done");
	}
	
	System.out.println("Done");
	
	int i = 10;
	int j = 20;
	int k = j += 10/5;
	    k = j = j +10/5;
	    k = j = 22;
	    k=22;
	    j=22;
	    i=10;
	    
}
}