package Day08_ShortHandOperators;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Task1
Declare and Initialize 2 numbers. Program should display if the first number is greater than second number.
Output should be in the following format: “First number number is greater than Second number –True/False”
	*/
	
		int a = 3;
		int b = 2;
		Boolean result = (a>b);
		System.out.println("The first number is greater than the second number –" + result);
		
		//Task2
		
		int ApplesCount=20;
		int OrangesCount=30;
		int PearsCount=30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >=PearsCount;
		
		System.out.println(comp);
	
		//Task3
		String OutsideWeather;
		int Degree;
		OutsideWeather="Shiny";
		Degree=70;
		boolean comp2=(!(OutsideWeather=="Rainy"||Degree==70));	
		
		System.out.println(comp2);
		
		//Task4
		
		int bb = 2;
		boolean res = ++bb == 2 || --bb == 2 && --bb == 2;
		System.out.println(res);
		
		//Task5
		boolean x=true, z=true;
		int y =20;
		x=(y!=10)||(z=false);
		
		System.out.println(x);
				
	}

}