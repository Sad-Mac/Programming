package exercises;

public class Num11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = (int)(Math.random() * 10 ) + 1;
		printStarTriangle(r);
	}
	
	public static void printStarTriangle(int n)
	{
	
		for (int row = 1; row <= n; row++)
		{
			int col = 1;
			for (; col <= n - row; col++)
			{
				System.out.print(" ");
				
			}
			
			for (; col < n + row ; col++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}

}
