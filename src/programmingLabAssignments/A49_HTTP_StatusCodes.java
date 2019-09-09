package programmingLabAssignments;

import java.util.Scanner;

public class A49_HTTP_StatusCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
    System.out.println("Enter status code:");
    int status = scan.nextInt();
    
    switch (status) {
    
    case 200:
    	System.out.println("OK");
    	break;
    case 201:
    	System.out.println("Created");
    	break;
    case 202:
    	System.out.println("Accepted");
    	break;
    case 301:
    	System.out.println("Moved Permanently");
    	break;
    case 303:
    	System.out.println("See Other");
    	break;	
    case 304:
    	System.out.println("Not Modified");
    	break;	
    
    case 307:
    	System.out.println("Temporary Redirect");
    	break;	
    case 400:
    	System.out.println("Bad Request");
    	break;		
    	
    case 401:
    	System.out.println("Unauthorized");
    	break;	

    case 403:
    	System.out.println("Forbidden");
    	break;	
    
    case 404:
    	System.out.println("Not Found");
    	break;	
    	
    	
    case 410:
    	System.out.println("Gone");
    	break;
    	
    case 500:
    	System.out.println("Internal Server Error");
    	break;	
    	
    case 503:
    	System.out.println("Service Unavailable");
    	break;		

    default:
    System.out.println("Invalid status code!");
    }   
    	/*
 
    else if (status==304)
        	System.out.println("Not Modified");
    else if (status==307)
    	System.out.println("Temporary Redirect");
    else if (status==400)
    	System.out.println("Bad Request");
    else if (status==401)
    	System.out.println("Unauthorized");
    else if (status==403)
    	System.out.println("Forbidden");
    else if (status==404)
    	System.out.println("Not Found");
    else if (status==410)
    	System.out.println("Gone");
    else if (status==500)
    	System.out.println("Internal Server Error");
    else if (status==503)
    	System.out.println("Service Unavailable");
    
    
	default:
		System.out.println("Invalid status code!");
	
	*/
    
	}

}

/*
STATUS CODES
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

Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

Example:
Display message: "Enter status code:"
input: 200
Display message: "OK"

*/