package chapter_exercises;

public class StarterFile1 {
	
	private static Ch7Location location;
	private static Ch7Weather weather;
	private static Ch7Time time;
	
	public static boolean isLeapYear(int year) {
		
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	
	
	// Chapter 7 Question 13
	public static boolean isLater(int month1, int day1, int year1, 
								  int month2, int day2, int year2) { 
		boolean isYear1Later = (year1 > year2);
		boolean isMonth1Later = (month1 > month2);
		boolean isDay1Later = (day1 > day2);
		
		return isYear1Later || isMonth1Later || isDay1Later;
		
//		return (year1 > year2) || 
//				(year1 == year2 && month1 > month2) || 
//				(year1 == year2 && month1 > month2 && day1 > day2);
			}
	
	public static void number14(int avg)
	{
		
		char grade = 0;
		
		if (avg < 60)
		{
			grade = 'F';
		}
		else if (avg < 70)
		{
			grade = 'D';
			
		}
		else if (avg < 80)
		{
			grade = 'C';
			
		}
		else if (avg < 90)
		{
			grade = 'B';
			
		}
		else if (avg < 100)
		{
			grade = 'A';
			
		}
		System.out.println("Your grade is a: " + grade);
		
	}
	
	// Chapter 7 Question 15 Part A
	public static void question15PartA() {
		boolean warm;
		if (location.isNorthPole() || location.isSouthPole()) {
			warm = false;
		} else if (location.isTropics()) {
			warm = true;
		} else if (time.getMonth() == 4 || time.getMonth() == 10) {
			if (weather.isSunny()) {
				warm = true;
			} else {
				warm = false;
			}
		} else if (location.isNorthernHemisphere(40)) {
			if (time.getMonth() >= 5 && time.getMonth() <= 9) {
				warm = true;
			} else {
				warm = false;
			}
		} else if (location.isSouthernHemisphere()) {
			if (time.getMonth() >= 11 || time.getMonth() <= 3) {
				warm = true;
			} else {
				warm = false;
			}
		} else {
			warm = false;
		}
	}
		
		
	// Chapter 7 Question 15 Part B
	public static void question15PartB() {
		boolean warm = false;
		
		if (location.isNorthPole() || location.isSouthPole()) {
			warm = false;
		} else if (location.isTropics()) {
			warm = true;
		} else if (time.getMonth() == 4 || time.getMonth() == 10) {
			if (weather.isSunny()) {
				warm = true;
			} else {
				warm = false;
			}
		} else if (location.isNorthernHemisphere(40)) {
			if (time.getMonth() >= 5 && time.getMonth() <= 9) {
				warm = true;
			} else {
				warm = false;
			}
		} else if (location.isSouthernHemisphere()) {
			if (time.getMonth() >= 11 || time.getMonth() <= 3) {
				warm = true;
			} else {
				warm = false;
			}
		} else {
			warm = false;
		}
	}
	
	// Chapter 7 Question 15 Part C
	public static void question15PartC() {
boolean warm = location.isNorthernHemisphere(40);
		
		if (location.isNorthPole() || location.isSouthPole()) {
			warm = false;
		} else if (location.isTropics()) {
			warm = true;
		} else if (time.getMonth() == 4 || time.getMonth() == 10) {
			if (weather.isSunny()) {
				warm = true;
			} else {
				warm = false;
			}
		} else if (location.isNorthernHemisphere(40)) {
			if (time.getMonth() >= 5 && time.getMonth() <= 9) {
				warm = true;
			} else {
				warm = false;
			}
		} else if (location.isSouthernHemisphere()) {
			if (time.getMonth() >= 11 || time.getMonth() <= 3) {
				warm = true;
			} else {
				warm = false;
			}
		} else {
			warm = false;
		}
	}
	
	// Chapter 7 Question 16
	public static double getOrderTotal(int bp, int nb) {
		
		double priceBP = 18.95;
		double priceNB = 21.95;
		double price1each = 37.95;
		double price3 = 15.95;
		double price12 = 14.00;
		
		int totalQty = bp + nb;
		double cost;
		
		if (totalQty >= 12) {
			cost = totalQty * price12;
		}else if (totalQty >= 3){
			cost = totalQty * price3;
		}else if (bp == 1 && nb == 1){
			cost = price1each;
		}else {
			cost = bp * priceBP + nb * priceNB;
		}
		
		return cost;
		
		//return 0.0d;
	}

	public static void main(String[] args) {
		// Write necessary code to test question 16 here...
		number14(85);
		

	}

}
