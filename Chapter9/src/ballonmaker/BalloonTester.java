package ballonmaker;

import java.awt.Color;

public class BalloonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon b1 = new Balloon();
		Balloon b2 = new Balloon(Color.MAGENTA);
		Balloon b3 = new Balloon(new Color(25, 128, 255), 100, 200, 300);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
