

import java.util.Scanner;

public class Tracing1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double x = sc.nextDouble();
	
		x = Math.pow(x, 0.5);
		x = Math.pow(x, 2.0);
		x = Math.cos(x);
		x = Math.sin(x);
		x = Math.tan(x);
		x++;
		x = (Math.random() * x)  + 1;
		x = Math.sqrt(x);
		x = Math.ceil(x);
		x += x % 10;
		
		System.out.println(x);
		System.out.println(doMath(x));
	}
	
	public static double doMath(double x) {
		
		int counter = 0;
		for (int i = 0; i < 10; i++) {
			counter += i % 3;
		}
		
		return counter;
	}

}
