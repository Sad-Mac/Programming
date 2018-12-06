package ballonmaker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class BalloonMaker extends JFrame {

	private static final int BALLOON_SIZE = 100;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton randomBtn;
	private JRadioButton redBtn;
	private JRadioButton blueBtn;
	private JRadioButton greenBtn;
	private JRadioButton yellowBtn;
	private JLabel countLbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonMaker frame = new BalloonMaker();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BalloonMaker() {
		setTitle("Balloon Maker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel.add(panel_2);
		
		randomBtn = new JRadioButton("Random");
		randomBtn.setBackground(Color.BLACK);
		randomBtn.setForeground(Color.WHITE);
		randomBtn.setSelected(true);
		panel_2.add(randomBtn);
		buttonGroup.add(randomBtn);
		
		redBtn = new JRadioButton("Red");
		redBtn.setBackground(Color.RED);
		redBtn.setForeground(Color.WHITE);
		panel_2.add(redBtn);
		buttonGroup.add(redBtn);
		
		blueBtn = new JRadioButton("Blue");
		blueBtn.setBackground(Color.BLUE);
		blueBtn.setForeground(Color.WHITE);
		panel_2.add(blueBtn);
		buttonGroup.add(blueBtn);
		
		greenBtn = new JRadioButton("Green");
		greenBtn.setBackground(Color.GREEN);
		greenBtn.setForeground(Color.WHITE);
		panel_2.add(greenBtn);
		buttonGroup.add(greenBtn);
		
		yellowBtn = new JRadioButton("Yellow");
		yellowBtn.setBackground(Color.YELLOW);
		yellowBtn.setForeground(Color.WHITE);
		panel_2.add(yellowBtn);
		buttonGroup.add(yellowBtn);
		
		countLbl = new JLabel("Count = 0");
		panel.add(countLbl);
		
		BalloonPanel balloonPnl = new BalloonPanel();
		balloonPnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Color c = getColor();
				int diameter = BALLOON_SIZE;
				int x = e.getX() - BALLOON_SIZE / 2;
				int y = e.getY() - BALLOON_SIZE / 2;
				Balloon b = new Balloon(x, y);
				//Balloon b = new Balloon(c, diameter, x, y);
				BalloonPanel.balloons.add(b);
			
				countLbl.setText("Count = " + BalloonPanel.balloons.size());
			}
		});
		contentPane.add(balloonPnl, BorderLayout.CENTER);
	}

	public Color getColor() {
		
		if (redBtn.isSelected()) {
			return Color.RED;
		} else if (blueBtn.isSelected()) {
			return Color.BLUE;
		} else if (greenBtn.isSelected()) {
			return Color.GREEN;
		} else if (yellowBtn.isSelected()) {
			return Color.YELLOW;
		} else {
			
			int rnd = (int)(Math.random() * 4) + 1;
			if (rnd == 1)
				return Color.RED;
			else if (rnd == 2) 
				return Color.BLUE;
			else if (rnd == 3)
				return Color.GREEN;
			else
				return Color.YELLOW;
			
		}
	}

}
