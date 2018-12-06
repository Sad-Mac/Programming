package boolean_expressions;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class CalcPnl extends JFrame {

	private JPanel contentPane;
	private JTextField firstNumberTB;
	private JTextField secondNumberTB;
	private JComboBox operationDd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcPnl frame = new CalcPnl();
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
	public CalcPnl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 463);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainPnl = new JPanel();
		mainPnl.setBackground(Color.WHITE);
		mainPnl.setForeground(Color.WHITE);
		contentPane.add(mainPnl, BorderLayout.CENTER);
		mainPnl.setLayout(new BoxLayout(mainPnl, BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		mainPnl.add(panel1);
		
		JLabel text1 = new JLabel("First Number");
		text1.setFont(new Font("Dialog", Font.BOLD, 24));
		panel1.add(text1);
		
		firstNumberTB = new JTextField();
		firstNumberTB.setFont(new Font("Dialog", Font.PLAIN, 24));
		panel1.add(firstNumberTB);
		firstNumberTB.setColumns(10);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		mainPnl.add(panel2);
		
		JLabel text2 = new JLabel("Second Number");
		text2.setFont(new Font("Dialog", Font.BOLD, 24));
		panel2.add(text2);
		
		secondNumberTB = new JTextField();
		secondNumberTB.setFont(new Font("Dialog", Font.PLAIN, 24));
		panel2.add(secondNumberTB);
		secondNumberTB.setColumns(10);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		mainPnl.add(panel3);
		
		operationDd = new JComboBox();
		operationDd.setFont(new Font("Dialog", Font.BOLD, 20));
		operationDd.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		panel3.add(operationDd);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		mainPnl.add(panel4);
		
		JLabel resultTB = new JLabel("Result");
		resultTB.setForeground(Color.ORANGE);
		resultTB.setFont(new Font("Dialog", Font.BOLD, 24));
		panel4.add(resultTB);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.WHITE);
		mainPnl.add(panel5);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.BLUE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 22));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n1 = firstNumberTB.getText().trim();
				String n2 = secondNumberTB.getText().trim();
				String op = operationDd.getSelectedItem().toString();
				
				String result = Calculator.getResult(n1, n2, op);
				resultTB.setText(result);
			
				
			}
		});
		panel5.add(btnSubmit);
	}

}
