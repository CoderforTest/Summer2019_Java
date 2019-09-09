package Day13_IfStatementsReview;

public class SwitchStatementsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String days = "Tuesday";

		switch (days) {

		case "Monday":
			System.out.println("It is Sunday.");
			break;
		default:
			System.out.println("invalid");
			break;
		case "Tuesday":
			System.out.println("It is Tuesday.");

		case "Thursday":
			System.out.println("It is Monday.");

		}

		String US = "USA";

		if (US == "USA" || US == "America" || US == "US") {
			System.out.println("American");
		} else {
			System.out.println("Not American");
		}
System.out.println("===============");
		// or

		switch (US) {
		case "USA":
		case "America":
		case "US":
			System.out.println("American");
			break;
		default:
			System.out.println("Not American");
			break;

		}

		System.out.println("============");

	}
}
