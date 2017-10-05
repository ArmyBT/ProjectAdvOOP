package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JButton;

public class Features {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Features window = new Features();
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
	public Features() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0E04\u0E38\u0E13\u0E2A\u0E21\u0E1A\u0E31\u0E15\u0E34\u0E04\u0E27\u0E32\u0E21\u0E2A\u0E32\u0E21\u0E32\u0E23\u0E16\u0E1E\u0E34\u0E40\u0E28\u0E29");
		frame.setBounds(100, 100, 482, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0E0A\u0E37\u0E48\u0E2D\u0E1A\u0E23\u0E34\u0E29\u0E31\u0E17 :");
		label.setBounds(23, 25, 55, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0E15\u0E33\u0E41\u0E2B\u0E19\u0E48\u0E07 :");
		label_1.setBounds(23, 50, 55, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0E04\u0E27\u0E32\u0E21\u0E2A\u0E32\u0E21\u0E32\u0E23\u0E16\u0E1E\u0E34\u0E40\u0E28\u0E29 :");
		label_2.setBounds(10, 91, 115, 14);
		frame.getContentPane().add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(100, 22, 220, 20);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(100, 47, 249, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(108, 110, 304, 128);
		frame.getContentPane().add(textArea);
		
		Button button = new Button("\u0E25\u0E1A\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25");
		button.setBounds(114, 258, 70, 22);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("\u0E1A\u0E31\u0E19\u0E17\u0E36\u0E01");
		button_1.setBounds(190, 258, 70, 22);
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("\u0E41\u0E01\u0E49\u0E44\u0E02");
		button_2.setBounds(266, 258, 70, 22);
		frame.getContentPane().add(button_2);
		
		Button button_3 = new Button("\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01");
		button_3.setBounds(342, 258, 70, 22);
		frame.getContentPane().add(button_3);
	}
}
