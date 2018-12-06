package introduction;

public class Example8 {
	
	public static boolean isPrime(int n) {
		
	public static boolean testGoldbach(int bigNum)
	{
		for (int n = 6; n <= bigNum; n += 2)
		{
			if (!found2Primes(n))
			{
				System.out.println(n + " is not a sum of two primes!");
				return false;
			}
		}
		return true;
	}
	}

	private static boolean found2Primes(int n) {
		boolean found2primes= false;
		for (int p = 3; p <= n/2; p += 2)
		{
			if (isPrime(p) && isPrime(n-p))
			{
				found2primes = true;
				break;
			}
		}
		return found2primes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
