package exercises;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RectangleTester extends JFrame {

	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;
	private static final int RECT_WIDTH = 200;
	private static final int RECT_HEIGHT = 125;
	private JPanel contentPane;
	private static Rectangle r;
	
	private class RectanglePanel extends JPanel {
		
		private Rectangle r;
		
		public RectanglePanel(Rectangle r) {
			this.r= r;
		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			int area1 = r.getW() * r.getH();
			g.drawString("Orginal Area:" + area1, 100, 20);
			g.setColor(Color.RED);
			g.fillRect(100, 25, r.getW(), r.getH());
			
			Rectangle copy = r.quadratize();
			int area2 = copy.getW() * copy.getH();
			g.setColor(Color.BLACK);
			g.drawString("Quadratized Area:" + area2, 100, 220);
			g.setColor(Color.BLUE);
			g.fillRect(100, 225, copy.getW(), copy.getH());
		}

	}

	public RectangleTester() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
		contentPane = new RectanglePanel(r);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public static void main(String[] args) {
		r = new Rectangle(RECT_WIDTH, RECT_HEIGHT);
		RectangleTester frame = new RectangleTester();
		frame.setVisible(true);
	}
}
