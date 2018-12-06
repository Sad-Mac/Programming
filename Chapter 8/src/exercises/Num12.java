package exercises;

import java.util.Scanner;

public class Num12 {
	
	private static final double price = 0.26;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		char answer;
		do {
			
			System.out.print("Enter Quantity: ");
			int quantity = keyboard.nextInt();
			keyboard.nextLine();
			
			
			
			if (quantity % 25 == 0)
			{
				System.out.printf("You have ordered %d Ripples -- $%.2f\n\n",
						quantity, price * quantity);
			}
			else
			{
				System.out.println("Ripples can be ordered in packs of 25.");
				
			}
			System.out.println("Next coustomer (y/n): ");
			
			do {
				String str = keyboard.nextLine();
				if (str.length() == 1)
				{
					answer = str.charAt(0);
					
				}
				else
				{
					answer = ' ';
				}
				
			}while (answer != 'y' && answer != 'n');
			
	}while(answer == 'y');
		System.out.println("Thank you for using the Ripple System");

}
}
