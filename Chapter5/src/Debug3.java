public class Debug3 {

	public static void main(String[] args) {

		long mystery = 23;	// Line 5
		int n = 10;	// Line 6

		while ( n > 0 ) { // Line 8

			mystery *= Math.round(Math.PI); // Line 10
			n--; // Line 11
		}

		System.out.println(mystery); // Line 14

	}

}