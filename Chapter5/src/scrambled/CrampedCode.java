/* This class calculates a total sale
* including tax, and prints a total
* sale to the console.
* Author: W. Butterfield 9/1/15 
* For use with chapter 5
*/
package scrambled;

public class CrampedCode 
{
	
	private double subtotal;
	private double tax;
	private double total;

	public CrampedCode() 
	{
		subtotal = 100.00;
		tax = 0.00;
		total = 0.00;
	}
	
	private double calcTax() 
	{
		return subtotal * .06;
	}
	
	private void makeSale(int quantity)
	{
		subtotal *= quantity;
		tax = calcTax();
		total = subtotal +  tax;
	}
	
	private void printReceipt()
	{
		System.out.println("Total Sale: $" + total);
	}
	
	public static void main(String[] args) 
	{
		CrampedCode s1 = new CrampedCode();
		s1.makeSale(3);
		s1.printReceipt();
	}
}