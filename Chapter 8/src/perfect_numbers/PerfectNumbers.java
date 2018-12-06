package perfect_numbers;

public class PerfectNumbers {

	public static void main(String[] args) {
		for (int i = 2; i < 29; i++){
			System.out.println("--------------------------");
			isPerfect(i);
		}
		
	}

	private static void isPerfect(int n) {
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

		System.out.println("n: " + n);
		System.out.println("m: " + m);
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
				System.out.println("k: " + k + " sum: " + sum);
			}
		}
		
		// print result
		if (sum == n)
			System.out.println(n + " is a perfect number.");
		else
			System.out.println(n + " is not a perfect number.");
	}

}
