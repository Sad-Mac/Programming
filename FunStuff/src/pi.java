import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		 
	      long count = 999999998;
	      double pi = 0;
	      double denominator = 1;
	      int x = 0;
	      while (x < count) {
	 
	         if (x % 2 == 0) {
	            pi = pi + (1 / denominator);
	         } else {
	            pi = pi - (1 / denominator);
	         }
	         denominator = denominator + 2;
	         x++;
	      }
	      pi = pi * 4;
	      System.out.println(pi);
	   }

}
