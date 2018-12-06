package introduction;

import java.util.Scanner;

public class Example4 {
	
	public static int sumUpTo(int n)
	{
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static long factorial(int n)
	{
		long f = 1;
		
		for (int k = 2; k <= n; k++)
		{
			f *= k;
		}
		
		return f;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =  new Scanner(System.in);
		int n;
		
		do
		{
			System.out.println("Enter an nteger from 4 to 20: ");
			n = kb.nextInt();
		}while (n < 4 || n > 20);
		
		System.out.println();
		System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
		System.out.println(n + "! = " + factorial(n));
		
	
	}

}
