package Day14_Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Saturday";
		
		switch (day) {
			case "Monday":
				
			case "Tuesday":
				System.out.println("Java class");
				break;
			case "Wednesday":
				System.out.println("SQL class");
				break;
			case "Thursday":
				
			case "Friday":
				System.out.println("Selenium class");
				break;
			case "Saturday":
				System.out.println("SQL class");
				break;
			default:
				System.out.println("Day off");
				 // we do not need break here. because } also closes the switch statement.
				
		}

}
}