package Day09_Review;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean GoodDay = !!!!!false; // true ==> false ==> true ==> false ==> true
		System.out.println(GoodDay);

		System.out.println(!!true); // !! cancel each other. result is true
		
		System.out.println(105.0>105);
	System.out.println("================");	
	
	boolean A = 128>'9' || 128==127;;
	//         first part is true, in ASCII table the highest value is 127. so '9' cant be higher than 127. second part is false.
	System.out.println(A);
	
	
boolean StupidOperators= 10>10 && 'a'>'b';//false and false
System.out.println(StupidOperators);
//a comes before b in ASCII table. so value of b is bigger.

System.out.println("=================");
int z =100;
// System.out.println("z>100 is : " + H);
//compile error (in main method only). H is not defined before this line.
boolean H = z>100; //false
System.out.println("=================");

System.out.println(5+7+ "8");
//"128". if there is string in the print out, any other type of character becomes string.


	}

}
