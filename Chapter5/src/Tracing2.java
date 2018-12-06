
public class Tracing2 {

	public static void main(String[] args) {
		/*
		 *  Add a breakpoint by double clicking to the
		 *   left of line 10
		 */
		int mystery = 13 * 17 + 7 % 2 * 9;	// Line 11
		
		mystery += mystery; 			// Line 13
		mystery *= mystery + mystery % 2; 	// Line 14 
		mystery -= mystery % 3; 		// Line 15 
		mystery -= mystery; 			// Line 16 
		mystery++; 				// Line 17	
		mystery *= 7;				// Line 18  
		mystery += mystery; 			// Line 19
		mystery *= mystery + mystery % 2; 	// Line 20 
		mystery -= mystery % 3; 		// Line 21 
		mystery -= mystery; 			// Line 22 
		mystery++; 				// Line 23	
		mystery *= 7;				// Line 24 
		
		for(int i = 0; i < 12; i++) {	        // Line 26
			int mystery2 = i * 33 % 7;	// Line 27
			mystery2++;
		}

	}

}