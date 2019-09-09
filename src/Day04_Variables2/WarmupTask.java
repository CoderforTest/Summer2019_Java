package Day04_Variables2;

public class WarmupTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Cucumber 2.5 dollars=>float or double
		 * 2 Onion 3 dollars=>float or double
		 * Pepper 2 dollars
		 * Tomatoes 12 dollars
		 * Carrot 24 dollars
		 */
		
		float Cucumber = 2.5f;//float cannot contain double
		double Cucumber2 = 2.5f;//double can contain float
		double Cucumber3 = 12;
		
		float Onion=1.5F;
		double Onion2=1.5;
				
		byte GreenPepper=2;
		short GreenPepper2=2;
		int GreenPepper3=2;
		long GreenPepper4=2L;
		float GreenPepper5=2;//only time we add f or F is when we are assigning decimals
		double GreenPepper6=2;
		
				
		System.out.println(GreenPepper); 
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5);//double and float converts the whole numbers to decimals
		System.out.println(GreenPepper6);

		int tomato = 3;
		int carrot=24;
		
		System.out.println(tomato);
		System.out.println(carrot);
	}

}
