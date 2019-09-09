package Day06_ArithmeticOperators;

public class PrimitivesCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Casting: converting larger primitive to smaller size.
		 *         datatype variablename=(datatype) value
		 *         explicit, and implicit castings
		 * primitives: byte, short, int, long, float, double
		 */
	
	int a =10;
	byte b = (byte) a;
	System.out.println(b);
	
	double DecimalNumber=10.5;
	float FloatNumber= (int) DecimalNumber;//double>float  explicit casting
	
	System.out.println(FloatNumber);
	
	long LongNum=300L;
	int IntNum= (int) LongNum;
	System.out.println(IntNum);
	
	//implicit casting: automatic casting from smaller type into larger type
	
	byte ByteNum=100;
	int IntNum2=ByteNum;
			//same as:
	int IntNum3=(int) ByteNum;
	
	short ShortNum=100;
	long LongNum2=ShortNum;
	
	
	//explicit casting examples:
	
	double largestNumber= 100.8765;   //largest primitive type is double
	byte byteValue= (byte) largestNumber;
	
	float FloatValue=(byte)largestNumber;
	
	System.out.println(byteValue);
	 
	System.out.println(FloatValue);
	
	float FloatNumber2 = 500.67F;
	int myNumber = (short) FloatNumber2;
	System.out.println(myNumber);
	}

}
