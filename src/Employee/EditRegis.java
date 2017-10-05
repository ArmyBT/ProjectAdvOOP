package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class EditRegis {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditRegis window = new EditRegis();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditRegis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 656, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Username :");
		label.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		label.setBounds(74, 18, 100, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.controlHighlight);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(169, 18, 193, 20);
		frame.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("Password :");
		label_1.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		label_1.setBounds(78, 43, 96, 14);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(169, 43, 193, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("Confirm Password :");
		label_2.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		label_2.setBounds(19, 69, 155, 14);
		frame.getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(169, 67, 193, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel label_3 = new JLabel("E- Mail :");
		label_3.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		label_3.setBounds(101, 95, 65, 14);
		frame.getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(169, 95, 258, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel label_4 = new JLabel("Phone Number :");
		label_4.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		label_4.setBounds(43, 125, 122, 14);
		frame.getContentPane().add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setForeground(SystemColor.desktop);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.controlHighlight);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_4.setBounds(168, 123, 194, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel label_5 = new JLabel("Address :");
		label_5.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		label_5.setBounds(90, 149, 76, 14);
		frame.getContentPane().add(label_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.controlHighlight);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textArea.setBounds(169, 147, 258, 103);
		frame.getContentPane().add(textArea);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(169, 271, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(437, 16, 193, 278);
		frame.getContentPane().add(textArea_1);
	}

}
