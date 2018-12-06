package exercises;


public class FCConverter {
	
	private double farenheit;
	private double celsius;

	public void setFahrenheit(double degrees) {
		// TODO Auto-generated method stub
		farenheit = degrees;
		celsius = (degrees - 32) * (5/9);
	}

	public double getCelsius() {
		// TODO Auto-generated method stub
		
		return celsius;
	}

	public void setCelsius(double degrees) {
		// TODO Auto-generated method stub
		celsius = degrees;
		farenheit = (degrees * 9/5) + 32;
		
	}

	public double getFahrenheit() {
		// TODO Auto-generated method stub
		return farenheit;
	}

}
