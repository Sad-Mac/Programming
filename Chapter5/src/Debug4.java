public class Debug4 {

	private static double number; // line 3

	private static double recursive(int n) { 
		if (n <= 1){	// line 6
			return 1;   // line 7
		}
		else {			// line 9
			number = Math.PI * n - 1; // line 10
			return Math.PI * recursive(n - 1); // line 11
		}
	}

	public static void main(String[] args) {
		recursive(7);	// line 16
	}

}