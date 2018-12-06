/*
 * This class is completely pointless.
 * Author: Quinn Tesny
 * For use in literally nothing.
 */



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class MemeTastic{

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("Don't Worry About It.");    
		JPanel panel=new JPanel();  
		panel.setBounds(0, 0, 300,200);    
		panel.setBackground(Color.gray); 
		
		JTextField text = new JTextField(15);
		text.setBounds(0, 0, 300, 60);
		text.setBackground(Color.GRAY);
		panel.add(text);
		Font font1 = new Font("SansSerif", Font.PLAIN, 20);
		text.setFont(font1);
		
		
		f.add(panel); 
		f.setSize(300, 200);    
		f.setLayout(null);    
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                      
		short potato = -32768;
		while (potato < 32767)
		{
			if (potato >= 32766)
			{
				
				potato = -32768;
			}
			
			potato++;
			
			String phill = String.valueOf(potato);
			text.setText(phill);
		}
		
	}

}
