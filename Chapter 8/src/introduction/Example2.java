package introduction;

public class Example2 {
	
	public static int sumUpTo(int n)
	{
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumUpTo(7));
	}

}
