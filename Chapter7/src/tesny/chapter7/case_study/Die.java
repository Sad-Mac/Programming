package tesny.chapter7.case_study;

public class Die {
	
	private int numDots;
	
	public void roll()
	{
		numDots = (int)(Math.random() * 6) + 1;
	}

	public int getNumDots()
	{
		return numDots;
		
	}






}
