package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.ComponentOrientation;



public class Search {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
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
	public Search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("\u0E04\u0E49\u0E19\u0E2B\u0E32\u0E1C\u0E39\u0E49\u0E2A\u0E21\u0E31\u0E04\u0E23\u0E07\u0E32\u0E19 :");
		label.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label.setBounds(10, 26, 117, 22);
		frame.getContentPane().add(label);
		
		TextField textField = new TextField();
		textField.setBounds(133, 26, 162, 22);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("\u0E04\u0E49\u0E19\u0E2B\u0E32");
		button.setIcon(null);
		button.setBounds(303, 26, 100, 22);
		frame.getContentPane().add(button);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(10, 73, 352, 153);
		frame.getContentPane().add(table);
	}
}
