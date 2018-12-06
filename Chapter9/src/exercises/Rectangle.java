package exercises;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		
		this.width = width;
		this.height = height;
		
		if (width < 0 && height < 0)
		{
			throw new IllegalArgumentException(
	                  "Canot use negative numbers");
		}
	}
	public Rectangle(int width) {
		this.width = width;
		this.height = height;
		if (width < 0)
		{
			throw new IllegalArgumentException(
	                  "Canot use negative numbers");
		}
	}
//	public Rectangle()
//	{
//		width = 1;
//		height = 1;
//	}
	public boolean isSquare()
	{
		if (width == height)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Rectangle quadratize()
	{
		
		int a;
		int s;
		a = width * height;
		s = (int)Math.sqrt(a);
		return new Rectangle(s, s);
	}
	
	public int getW()
	{
		return width;
	}
	
	public int getH()
	{
		return height;
	}

}
