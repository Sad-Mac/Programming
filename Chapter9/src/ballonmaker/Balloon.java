package ballonmaker;

import java.awt.Color;

public class Balloon {
	
	private Color color;
	private int diameter;
	private int x;
	private int y;

	public Balloon() {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		
		Color random = new Color(r, g, b);
		
		color = random;
		diameter = (int)(Math.random() * 100) + 50;
		x = 100;
		y = 100;
		
	}
	
	public Balloon(Color c) {
		this();
		color = c;
		
		
	}
	public Balloon(Color c, int d, int x, int y) {
		color = c;
		diameter = d;
		x = 100;
		y = 100;
		
		
	}
	
	public Balloon(int x, int y)
	{
		this();
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "Color: " + color.toString() + ", diameter: " + diameter +
				", x: " + x + ", y: " + y;
		
	}
	
	public Color getColor() 
	{
		return color;
	}
	
	public int getDiameter()
	{
		return diameter;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int value)
	{
		this.y = value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
