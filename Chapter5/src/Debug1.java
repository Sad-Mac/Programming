public class Debug1 {

	public static void main(String[] args) {

		double mystery = 1;	// Line 5

		mystery += Math.PI * 3; // Line 7
		mystery *= Math.sin(mystery) * Math.PI;	// Line 8
		mystery += Math.cos(mystery) / Math.PI;	// Line 9
		mystery /= Math.tan(mystery) % Math.PI;	// Line 10
		mystery += Math.abs(mystery) * Math.abs(Math.pow(mystery, 2)); // Line 11

		int result = (int) Math.floor(mystery + .5d); // Line 13
		System.out.println(result);	// Line 14

	}

}