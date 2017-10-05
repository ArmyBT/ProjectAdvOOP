package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Register {

	private JFrame frmRegister;
	private JTextField textName;
	private JTextField textPassword;
	private JTextField textConfirm;
	private JTextField textEmail;
	private JTextField textTel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("Register");
		frmRegister.setBounds(100, 100, 570, 396);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegister.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 24));
		lblRegister.setBounds(216, 11, 100, 28);
		frmRegister.getContentPane().add(lblRegister);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblUsername.setBounds(74, 90, 100, 14);
		frmRegister.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblPassword.setBounds(78, 115, 96, 14);
		frmRegister.getContentPane().add(lblPassword);
		
		JLabel lblConfpassword = new JLabel("Confirm Password :");
		lblConfpassword.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblConfpassword.setBounds(10, 142, 164, 14);
		frmRegister.getContentPane().add(lblConfpassword);
		
		JLabel lblEMail = new JLabel("E- Mail :");
		lblEMail.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblEMail.setBounds(101, 167, 65, 14);
		frmRegister.getContentPane().add(lblEMail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblPhoneNumber.setBounds(36, 195, 130, 14);
		frmRegister.getContentPane().add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		lblAddress.setBounds(90, 221, 76, 14);
		frmRegister.getContentPane().add(lblAddress);
		
		textName = new JTextField();
		textName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textName.setBounds(169, 90, 193, 20);
		frmRegister.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textPassword.setBounds(169, 115, 193, 20);
		frmRegister.getContentPane().add(textPassword);
		textPassword.setColumns(10);
		
		textConfirm = new JTextField();
		textConfirm.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textConfirm.setBounds(169, 139, 193, 20);
		frmRegister.getContentPane().add(textConfirm);
		textConfirm.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textEmail.setBounds(169, 167, 258, 20);
		frmRegister.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textTel = new JTextField();
		textTel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textTel.setBounds(168, 195, 194, 20);
		frmRegister.getContentPane().add(textTel);
		textTel.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textArea.setBounds(169, 219, 258, 103);
		frmRegister.getContentPane().add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnSave.setIcon(new ImageIcon(Register.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnSave.setBounds(434, 52, 110, 23);
		frmRegister.getContentPane().add(btnSave);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnClear.setIcon(new ImageIcon(Register.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnClear.setBounds(434, 77, 110, 23);
		frmRegister.getContentPane().add(btnClear);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnCancel.setIcon(new ImageIcon(Register.class.getResource("/javax/swing/plaf/metal/icons/ocean/close-pressed.gif")));
		btnCancel.setBounds(434, 104, 110, 23);
		frmRegister.getContentPane().add(btnCancel);
		
		JRadioButton radioButton1 = new JRadioButton("\u0E2A\u0E21\u0E31\u0E04\u0E23\u0E07\u0E32\u0E19");
		radioButton1.setBounds(166, 60, 83, 23);
		frmRegister.getContentPane().add(radioButton1);
		
		JRadioButton radioButton = new JRadioButton("\u0E1A\u0E23\u0E34\u0E29\u0E31\u0E17");
		radioButton.setBounds(245, 60, 65, 23);
		frmRegister.getContentPane().add(radioButton);
	}
}
