package introduction;

public class Example5 {
	
	public static boolean isPrime(int n)
	{
		boolean noFactors = true;
		if (n <= 1)
				return false;
		for (int m = 2; noFactors; m++)
		{
			if (m * m > n)
				break;
			
			if (n % m == 0)
				noFactors = false;
			
		}
		return noFactors;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
