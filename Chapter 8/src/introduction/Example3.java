package introduction;

public class Example3 {
	
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
		System.out.println(factorial(3));
		System.out.println(factorial(4));
	}

}
