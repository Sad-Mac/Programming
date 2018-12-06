package introduction;

public class Example6 {
	
	public static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
		
		int m = 2;
		
		while (m * m <= n)
		{
			if (n % m == 0)
			{
				return false;
				
			}
			m++;
			
			
		}
		return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
