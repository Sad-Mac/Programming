package perfect_numbers;

import java.util.Scanner;

public class MyMath {
	/**
	 * Returns the sum of all integers from 1 to n, if n >= 1, and 0 otherwise.
	 */
	public static int sumUpTo(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		return sum;
	}

	/**
	 * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
	 */
	public static long factorial(int n) {
		long f = 1;

		for (int k = 2; k <= n; k++)
			f *= k;

		return f;
	}

	/**
	 * Returns true if n is a prime; otherwise returns false
	 */
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		int m = 2;

		while (m * m <= n) {
			if (n % m == 0)
				return false;
			m++;
		}

		return true;
	}

	/**
	 * Tests Goldbach conjecture for even numbers up to bigNum
	 */
	public static boolean testGoldbach(int bigNum) {
		for (int n = 6; n <= bigNum; n += 2) // obviously true for n = 4
		{
			boolean found2primes = found2primes(n);

			if (!found2primes) {
				System.out.println(n + " is not a sum of two primes!");
				return false;
			}
		}

		return true;
	}

	private static boolean found2primes(int n) {
		boolean found2primes = false;

		for (int p = 3; p <= n / 2; p += 2) {
			if (isPrime(p) && isPrime(n - p)) {
				found2primes = true;
				break; // makes the loop more efficient, page 208
			}
		}
		return found2primes;
	}

	/*********************************************************************/
	public static boolean isPerfect(int n) {
		/*
		 * We know that one of the divisors will always be 1, so initialize an
		 * integer variable named sum to 1
		 */
		int sum = 1;

		/*
		 * 2. Determine when the pattern will result in a prime number create an
		 * integer variable called m and initialize it to the integer value of
		 * Math.sqrt(n)
		 */
		int m = (int)Math.sqrt(n);

		//System.out.println("n: " + n);
		//System.out.println("m: " + m);
		/*
		 * 3. Create a loop that will iterate from 2 through and including m.
		 * 4. During each iteration check if n modulo k is zero 
		 * 5. if n modulo k is zero, add k to the total of sum, 
		 * then also add the value of n / k to sum.
		 */
		
		for (int k = 2; k <= m; k++) {
			if (n % k == 0) {
				sum += k;
				sum += n / k;
				//System.out.println("k: " + k + " sum: " + sum);
			}
		}
		
		// print result
		if (sum == n)
			return true;
		else
			return false;
	}

	/**
	 * Prints the first n perfect numbers
	 */
	public static void printPerfectNums(int n) {
		System.out.println("Perfect numbers: ");
		int count = 0;
		for (int k = 1; count < n; k++) {
			if (isPerfect(k)) {
				System.out.print(k + " ");
				count++;
			}
		}
		System.out.println();
	}

	/**
	 * Prints the first n Mersenne primes
	 */
	public static void printMersennePrimes(int n) {
		System.out.println("Mersenne primes: ");
		int count = 0;
		int pow2 = 2;
		
		/* 1. examine the printPerfectNums method above and
		 *    use that method as a template to complete this
		 *    method.
		 *   
		 * 2. The objective of this method is to 
		 *    print n mersenne primes.
		 */
		for (int k = 1; count < n; k++) {
			if (isPrime(pow2 - 1)) {
				System.out.print(pow2 - 1 + " ");
				count++;
			}
			pow2 *= 2;
		}
		System.out.println();
		
	
	}
	
	public static void printEvenPerfectNums(int n)
	  {
	    System.out.println("Even perfect numbers: ");
	    // 3. Create a variable called count that holds the value 0
	    int count = 0;
	    // 4. Create a variable called pow2 that holds the value 2
	    int pow2 = 2;
	    // 5. Create a loop that will iterate from count to n
	    for (int k = 1; count < n; k++) {
			if (isPrime(pow2 - 1))
			{
				System.out.print((long)(pow2 - 1) * (pow2 / 2) + " ");
				count++;
			}
				pow2 *= 2;
		}
		System.out.println();
	    /* 6. In the body of the loop, check if pow2 - 1 is prime,
	     *    if it is then print pow2 - 1 times pow2 / 2 and
	     *    increment count, otherwise multiply pow2 times 2
	     */
	  }

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n;

		do {
			System.out.print("Enter an integer from 4 to 20: ");
			n = kb.nextInt();
			System.out.print("You picked " + n + ", good luck.");
		} while (n < 4 || n > 20);

		System.out.println();
		System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
		System.out.println(n + "! = " + factorial(n));
		System.out.println("Primes: ");
		for (int k = 1; k <= n; k++)
			if (isPrime(k))
				System.out.print(k + " ");
		System.out.println();
		System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));

		// 7. print the first 4 perfect numbers to the console
	    printPerfectNums(4);
	    printMersennePrimes(4);
	    printEvenPerfectNums(n);
	}
}
