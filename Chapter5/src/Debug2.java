public class Debug2 {

	public static void main(String[] args) {

		double mystery = 3;	// Line 5
		int iteration = 1;	// Line 6

		while ( iteration < 1000 ) { // Line 8

			mystery += Math.PI * mystery; // Line 10
			iteration++; // Line 11
		}

		System.out.println(mystery); // Line 14

	}

}
