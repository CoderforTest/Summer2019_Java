package Day08_ShortHandOperators;

public class LogicalOperators{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * && : And logic ==> true && true == true,// both conditions must be true to get true result. otherwise false.
		 * || : Or logic ==> if both conditions are false it will return false, otherwise true.
		 */
	
	boolean ResultA = 9 == 0 && "Muhtar" == "good";
	System.out.println(ResultA);
	
	boolean ResultB=8>5 && 7==(8-2+1);
	System.out.println(ResultB);

	boolean A = "Monday" == "Funday" || 6==6;
	//			        false		 or	true	==> true
	
	boolean C = !(8>5) || !("Today" != "friday");
	//			!true  or !true
	//			false  or false    ==>false
	
	boolean E = !(7>5 && 6 !=5) && (9>5 || 10>4);
	System.out.println(E);
	
	boolean GoodDay=!!!!!false;
	System.out.println(GoodDay);
	}

}
