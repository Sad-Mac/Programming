/* This class calculates the area
* of a rectangle by multiplying
* length times width and printing
* the result.
* Author: W. Butterfield 9/1/15 
* For use with chapter 5
*/
package scrambled;

import java.util.Scanner;

public class SelfExplanatoryCode 
{

	private int length;
	private int width;

	public SelfExplanatoryCode() 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = s.nextInt();
		System.out.print("Enter width: ");
		width = s.nextInt();
	}

	private int getArea(int length, int width)
	{
		return length * width;
	}

	public static void main(String[] args)
	{
		SelfExplanatoryCode obvious = new SelfExplanatoryCode();
		System.out.print("Area: " + obvious.getArea(obvious.length, obvious.width));
	}
}