package exercises;

import java.util.Scanner;

public class Chapter8Exercises {
	
	// Exercise #1 page 212
	public static int calculateYear(int target) {
		double population = 111.2d;
		double growthRate = 1.0113;
		int year = 2010;
		
		// write a while loop here that solves the problem...
		while(population < 120.0d)
		{
			population *= growthRate;
			year++;
		}
		System.out.println("Mexico will have a population of " + target
				+ " million in the year " + year + ".");
		return year;
	}
	
	// Exercise #2 page 212
	public static int learnJava() {
		int m = 0; //months
		int y = 0; //years
		int material = 0;
		int required = 95;
		
		while (material <= required)
		{
			material += 10;
			m++;
		}

		// y is the years and m is the number of months
		System.out.println("Kevin will learn Java in " + y + " year(s) and " + m + " month(s).");
		
		return m;
	}
	
	// Exercise #3 page 212
	private static int addOdds(int n) {
		int result = 0;
		
		// use only a for loop, n, and the result variable to solve this problem
		for (int i = 1; i <= n; i+= 2)
		{
			result += i;
		}
		
		System.out.println("The sum of all odd numbers to " + n + " is: " + result);
		return result;
	}
	
	// Exercise #5 page 213
	private static int addNumbers() {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter a positive integer under 10: ");
		int sum = 0;
		int n = kboard.nextInt();
		int i = 0;
		while (n > i)
		{
			sum += 1;
			i++;
			if (i == n);
			{
				
			}
		}
		// create the loop here...
		
		System.out.print(i + " + " );
		return sum;
	}
	
	public static void main(String[] args) {
		
		// Exercise #1 page 212
		calculateYear(120);
		// Exercise #2 page 212
		learnJava();
		// Exercise #3 page 212
		addOdds(199);
		// Exercise #5 page 213
		addNumbers();
			
	}




}

