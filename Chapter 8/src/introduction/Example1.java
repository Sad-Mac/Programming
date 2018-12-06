package introduction;

public class Example1 {
	
	public static int sumUpTo(int n) {
		int sum = 0;
		int i = 1;
		
		while (i <= n)
		{
			sum += i;
			i++;
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		System.out.println(sumUpTo(7));
	}
	
}
