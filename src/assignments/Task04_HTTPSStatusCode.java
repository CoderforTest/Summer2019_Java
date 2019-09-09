package assignments;

public class Task04_HTTPSStatusCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		HTTP is the protocol that governs communications between web 
		servers and web clients (i.e. browsers). Part of the protocol includes
		a status code returned by the server to tell the browser the status of
		its most recent page request. Some of the codes and their meanings are
		listed below:
		
		status code: 
		200, OK
		201, Created
		202, Accepted
		301, Moved Permanently
		303, See Other
		304, Not Modified
		307, Temporary Redirect
		400, Bad Request
		401, Unauthorized
		403, Forbidden
		404, Not Found
		410, Gone
		500, Internal Server Error
		503, Service Unavailable

		1. declare an int variable called StatusCode
		2. write an if statement that prints out, on a line by itself,
		the appropriate label from the above list based on status.

		Example:
		if status code = 200
		output:
		ok

		if status code = 201:
		output:
		created 
		.....
		
		*/
		
		int StatusCode = 410;
		
		
		if (StatusCode==200) {
			System.out.println("OK");
		}
		
		else if (StatusCode==201) {
			System.out.println("Created");
	}

		else if (StatusCode==202) {
			System.out.println("Accepted");
	}
		
		else if (StatusCode==301) {
			System.out.println("Moved Permanently");
	}
		
		else if (StatusCode==303) {
			System.out.println("See Other");
	}
		
		else if (StatusCode==304) {
			System.out.println("Not Modified");
	}
		
		else if (StatusCode==307) {
			System.out.println("Temporary Redirect");
	}
		
		else if (StatusCode==400) {
			System.out.println("Bad Request");
	}
		
		else if (StatusCode==401) {
			System.out.println("Unauthorized");
	}
		
		else if (StatusCode==403) {
			System.out.println("Forbidden");
	}
		
		else if (StatusCode==404) {
			System.out.println("Not Found");
	}
		
		else if (StatusCode==410) {
			System.out.println("Gone");
	}
		
		else if (StatusCode==500) {
			System.out.println("Internal Server Error");
	}
		
		else if (StatusCode==503) {
			System.out.println("Service Unavailable");
	}
				
}

}