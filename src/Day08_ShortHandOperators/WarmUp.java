package Day08_ShortHandOperators;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * write a java program that converts gallon to liter
		 * 1 gallon=3.785 liters
		 * 
		 * write a java program that converts liter to gallon
		 * 1 gallon=3.785 liters
		 */
	
		
			double gallon=100;
			double liter=gallon*3.785;
			String result1= gallon + " gallons equal to " + liter + " liters.";
			
			System.out.println(result1);
			
			double L=1;
			double G= L / 3.785;
			
			System.out.println(L + " liters equal to " + G + " gallons.");
			
			
			
	
	}

}
