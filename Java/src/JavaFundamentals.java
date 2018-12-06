/* Use this class to complete all of the exercises from
 * the Java Fundamentals worksheets #19-27
 * 
 * FIX ANY ERRORS SHOWN ON EACH WORKSHEET
 */
public class JavaFundamentals {
	
	// the following is the String referred to as STRINGS.txt on the worksheet
	private static String text = "Before we begin our banquet, I would like to say a few words. And here they are: Nitwit! Blubber! Oddment! Tweak! Thank you. Is he a bit mad? Mad? He\'s a genius! Best wizard in the world! But he is a bit mad, yes. Potatoes, Harry?";
	
	private static void worksheet19() {
		String sentence = text; 
		System.out.println("19. " + (sentence.indexOf('B') == 0));		// Use println instead of print
	}
	
	private static void worksheet20() {
		// This should check if the letter 'B' is at index 0, just like in exercise 19.
		// Uncomment and complete the missing expression on the three lines below:
		String sentence = text;
		boolean isEqual = sentence.indexOf('B') == 0 ;
		System.out.println("20. " + (isEqual));
	}
	
	private static void worksheet21() {
		// Write the 2 statements shown on your worksheet here and fix any errors.
		// Uncomment the next two lines and finish initiazing the variable.
		boolean boolvar = true ;
		System.out.println("21. " + (  boolvar  ));
	}
	
	private static void worksheet22() {
		// Write the 3 statements shown on your worksheet here and fix any errors.
		String sentance = "Before we begin our banquet, I would like to say a few words. And here they are: Nitwit! Blubber! Oddment! Tweak! Thank you. Is he a bit mad? Mad? He\\'s a genius! Best wizard in the world! But he is a bit mad, yes. Potatoes, Harry?";
		boolean isEqual = sentance.charAt(0) == 'B';
		System.out.println("22. " + (  isEqual  ));
	}
	
	private static void worksheet23() {
		// Write the 4 statements shown on your worksheet here and fix any errors.
		String sentance = "Before we begin our banquet, I would like to say a few words. And here they are: Nitwit! Blubber! Oddment! Tweak! Thank you. Is he a bit mad? Mad? He\\\\'s a genius! Best wizard in the world! But he is a bit mad, yes. Potatoes, Harry?";
		boolean isEqual = sentance.charAt(0) == 'B';
		if (isEqual)
		{
			System.out.println("23. " + "B good!");
		}
	}
	
	private static void worksheet24() {
		// Write the 5 statements shown on your worksheet here and fix any errors.
		String sentance = "Before we begin our banquet, I would like to say a few words. And here they are: Nitwit! Blubber! Oddment! Tweak! Thank you. Is he a bit mad? Mad? He\\\\'s a genius! Best wizard in the world! But he is a bit mad, yes. Potatoes, Harry?";
		boolean isEqual = sentance.charAt(0) == 'C';
		if (isEqual)
		{
			System.out.println("24. " + "B good!");
		}
		System.out.println("24. " + "C good!");
	}
	
	private static void worksheet25() {
		// Write the 5 statements shown on your worksheet here and fix any errors.
		String sentance = "Before we begin our banquet, I would like to say a few words. And here they are: Nitwit! Blubber! Oddment! Tweak! Thank you. Is he a bit mad? Mad? He\\\\'s a genius! Best wizard in the world! But he is a bit mad, yes. Potatoes, Harry?";
		boolean isEqual = sentance.charAt(0) == 'e';
		if (isEqual)
		{
			System.out.println("25. " + "e all be good");
		}
		else {
		System.out.println("25. " + "e all still be good");
		}
	}
	
	private static void worksheet26() {
		// Write the 3 statements shown on your worksheet here and fix any errors.
		boolean isEqual = 2 + 2 == 4;
		if(isEqual)
		{
			System.out.println("26. " + "2 + 2 == 4");
		}
	}
	
	private static void worksheet27() {
		// Write the 3 statements shown on your worksheet here and fix any errors.
		boolean isEqual = "Hello".equals("Hello");
		System.out.println("27. " + (  isEqual  ));
		
	}

	public static void main(String[] args) {
		worksheet19();
		worksheet20();
		worksheet21();
		worksheet22();
		worksheet23();
		worksheet24();
		worksheet25();
		worksheet26();
		worksheet27();
	}

}
