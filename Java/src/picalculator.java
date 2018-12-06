import java.util.Scanner;

public class picalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		long pi = 0;
		for (int i = 0; count < 0; i--) {
		      pi += Math.pow(-1, i + 1) / (2 * i - 1); // Calculate series in parenthesis
		      if (i == 1) { // When at last number in series, multiply by 4
		        pi *= 4;    
		        System.out.println(pi); // Print result
		      }  
		}

	}

}
