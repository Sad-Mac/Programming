/* This class prints a hello message
	 * to the console after the user enters
	 * their first name and last name.
	 * Author: W. Butterfield 9/1/2015
	 * For use with chapter 5
	 */
package scrambled;

import java.util.Scanner;

public class HelloWorld2 
{
	
	public static void main(String[] args) 
	{
		
	Scanner s = new Scanner(System.in);System.out.print("Enter your first name: ");
	
	String firstName = s.next();
	
	System.out.print("Enter your last name: ");
	
	String lastName = s.next();
	
	System.out.println("Hello, " + firstName + " " + lastName + ".");
	
	
	}
}