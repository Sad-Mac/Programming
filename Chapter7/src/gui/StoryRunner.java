package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StoryRunner extends JFrame {

	private JPanel contentPane;
	private JLabel storyTextLbl;
	private StoryText story;
	private Navigator navigator;
	private JButton btnA;
	private JButton btnB;
	private JLabel myImage;
	private JPanel textPnl;
	private JPanel picturePnl;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryRunner frame = new StoryRunner();
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
	public StoryRunner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		centerWindow();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblCastleExplorer = new JLabel("Story Project");
		lblCastleExplorer.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCastleExplorer.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCastleExplorer, BorderLayout.NORTH);
		
		JPanel middlePnl = new JPanel();
		contentPane.add(middlePnl, BorderLayout.CENTER);
		middlePnl.setLayout(new BoxLayout(middlePnl, BoxLayout.Y_AXIS));
		
		textPnl = new JPanel();
		middlePnl.add(textPnl);
		
		storyTextLbl = new JLabel("Story Text");
		textPnl.add(storyTextLbl);
		storyTextLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		storyTextLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		storyTextLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		storyTextLbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		picturePnl = new JPanel();
		middlePnl.add(picturePnl);
		
		myImage = new JLabel("");
		picturePnl.add(myImage);
		myImage.setHorizontalAlignment(SwingConstants.CENTER);
		

		
		JPanel bottomPnl = new JPanel();
		contentPane.add(bottomPnl, BorderLayout.SOUTH);
		
		btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean isChoiceA = true;
				advanceTheStory(isChoiceA);
			}
		});
		bottomPnl.add(btnA);
		
		btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean isChoiceA = false; // choice B
				advanceTheStory(isChoiceA);
			}
		});
		bottomPnl.add(btnB);
		
		story = new StoryText();
		navigator = new Navigator();
		showStory();
		showImage();
		//ResourceLoader.playAudio("epic.wav");
	}
	
	private String getHTML() {
		int node = navigator.getNode();
		
		return "<html>" +
	
				   "<p>" +
					 story.getDescription(node) +
				   "</p>" +
					 
				   "<p><br />" +
					 story.getPrompt(node) +
				   "</p><br />" +
					 
			   "</html>";
	}
	
	private void showStory() {
		String text = getHTML();
		int node = navigator.getNode();
		storyTextLbl.setText(text);
		btnA.setText(story.getOptionA(node));
		btnB.setText(story.getOptionB(node));
	}
	
	private void showImage() {
		int node = navigator.getNode();
		// String fileName = StoryImage.getImage(node);
		// Image source = ResourceLoader.getImage(fileName);
		// ImageIcon icon = new ImageIcon(source);
		// myImage.setIcon(icon);
	}

	protected void advanceTheStory(boolean navigateToOptionA) {
		navigator.navigate(navigateToOptionA);
		showStory();
		showImage();
	}
	
	private void centerWindow() {
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
	}
}
