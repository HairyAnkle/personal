package wWinbuilder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUp1 extends JFrame implements ActionListener {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton registerButton;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JLabel usernameLabel;
	private JLabel lblEmail;
	private JTextArea tout;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public SignUp1() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
			frame = new JFrame("Registration Form");
			frame.setBounds(100, 100, 528, 415);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			usernameLabel = new JLabel("Username:");
			usernameLabel.setFont(new Font("Consolas", Font.PLAIN, 14));
			usernameLabel.setBounds(40, 55, 79, 34);
			frame.getContentPane().add(usernameLabel);
			
			textField = new JTextField();
			textField.setBounds(116, 52, 253, 34);
			frame.getContentPane().add(textField);
			
			textField_1 = new JTextField();
			textField_1.setBounds(116, 99, 253, 34);
			frame.getContentPane().add(textField_1);
			
			lblEmail = new JLabel("Email:");
			lblEmail.setFont(new Font("Consolas", Font.PLAIN, 14));
			lblEmail.setBounds(40, 99, 79, 34);
			frame.getContentPane().add(lblEmail);
			
			lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Consolas", Font.PLAIN, 14));
			lblPassword.setBounds(40, 143, 79, 34);
			frame.getContentPane().add(lblPassword);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(116, 143, 253, 34);
			frame.getContentPane().add(passwordField);
			
			lblNewLabel = new JLabel("Registration Form");
			lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 17));
			lblNewLabel.setBounds(164, 10, 169, 32);
			frame.getContentPane().add(lblNewLabel);
			
			registerButton = new JButton("Register");
			registerButton.addActionListener(this);
			registerButton.setFont(new Font("Consolas", Font.BOLD, 14));
			registerButton.setBounds(40, 234, 107, 34);
			frame.getContentPane().add(registerButton);
			
			passwordField_1 = new JPasswordField();
			passwordField_1.setBounds(116, 190, 253, 34);
			frame.getContentPane().add(passwordField_1);
			
			tout = new JTextArea();
	        tout.setFont(new Font("Arial", Font.PLAIN, 15));
	        tout.setSize(300, 400);
	        tout.setLocation(500, 100);
	        tout.setLineWrap(true);
	        tout.setEditable(false);
			
			JLabel lblConfrimPassword = new JLabel("Confrim Password:");
			lblConfrimPassword.setFont(new Font("Consolas", Font.PLAIN, 10));
			lblConfrimPassword.setBounds(12, 190, 107, 34);
			frame.getContentPane().add(lblConfrimPassword);
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String username = usernameLabel.getText();
            String email = lblEmail.getText();
            String password = new String(passwordField.getPassword());
            // Add code to register user
            JOptionPane.showMessageDialog(this, "User registered successfully!");
            frame.dispose();
        }
        
	}
	
}



	
