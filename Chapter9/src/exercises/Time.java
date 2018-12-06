package exercises;

public class Time {
	
	private int hours;
	private int mins;

	public Time (int h1, int m1)
	{
		if (h1 < 0 || h1 >= 24 || m1 < 0 || m1 > 60)
		{
			throw new IllegalArgumentException(
	                  "Not a real time");
		}
		this.hours = h1;
		this.mins = m1;
		
	}
	
	private int toMins()
	{
		int m = hours * 60;
		m += mins;
		return m;
	}
	
	public boolean lessThan(Time t)
	{
		if (this.hours < t.hours)
			return true;
		else if (this.hours == t.hours && this.mins < t.mins)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return null;
	}

	public String elapsedSince(Time t1) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
