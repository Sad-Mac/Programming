package chapter_exercises;

public class Ch7Location {

	public boolean isNorthPole() {
		return true;
	}
	
	public boolean isSouthPole() {
		return true;
	}
	
	public boolean isTropics() {
		return true;
	}
	
	public boolean isNorthernHemisphere(int latitude) {
		
		return latitude > 0;
	}
	
	public boolean isSouthernHemisphere() {
		return true;
	}
}
