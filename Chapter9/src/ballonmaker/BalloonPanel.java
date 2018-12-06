package ballonmaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BalloonPanel extends JPanel implements ActionListener {
	
	private static final int DELAY = 50;
	public static ArrayList<Balloon> balloons;
	private Timer t;
	
	public BalloonPanel() {
		setBackground(Color.WHITE);
		balloons = new ArrayList<Balloon>();
		t = new Timer(DELAY, this);
		t.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < balloons.size(); i++) {
			drawBalloon(g, i);
		}
	}
	
	private void drawBalloon(Graphics g, int i) {
		Balloon b = balloons.get(i);
		
		// draw the balloon
		Color color = b.getColor();
		int diameter = b.getDiameter();
		int x = b.getX();
		int y = b.getY();
		g.setColor(color);
		g.fillOval(x, y, diameter, diameter);
		
		// draw the string that hangs below the balloon
		int centerOfBalloon = x + diameter / 2;
		int bottomOfBalloon = y + diameter;
		int arcWidth = diameter / 4;
		int arcHeight = diameter * 3;
		int startAngle = 0;
		int sweep = 90;
		g.drawArc(centerOfBalloon, bottomOfBalloon, arcWidth, arcHeight, startAngle, sweep);
		
		// number the balloon
		int num = i + 1;
		int middleX = x + (int)(diameter * 0.4d);
		int middleY = y + (int)(diameter * 0.6d);
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(num), middleX, middleY);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for (int i = 0; i < balloons.size(); i++){
			Balloon b = balloons.get(i);
			b.setY( b.getY() - 1 );
		}
		
		this.repaint();
		
	}

}
