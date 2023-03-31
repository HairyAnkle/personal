package exam;

import java.awt.EventQueue;

import javax.swing.*;


import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginExam{

	JFrame frame;
	private JTextField userTextBox;
	private JPasswordField passwordField;
	private JLabel userName;
	private JLabel passWord;
	private JCheckBox chckbxNewCheckBox;
	private JButton LoginButton;	
	private JButton CancelButton;
	private JLabel signUP;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application. 
	 */
	public LoginExam() {
		initialize();
		frame.setVisible(false);
		frame.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 523, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		userTextBox = new JTextField();
		userTextBox.setColumns(10);
		userTextBox.setBounds(136, 47, 263, 25);
		frame.getContentPane().add(userTextBox);
		
		userName = new JLabel("Username");
		userName.setFont(new Font("Candara", Font.PLAIN, 14));
		userName.setBackground(Color.LIGHT_GRAY);
		userName.setBounds(64, 54, 62, 15);
		frame.getContentPane().add(userName);
		
		passWord = new JLabel("Password");
		passWord.setFont(new Font("Candara", Font.PLAIN, 14));
		passWord.setBounds(64, 89, 70, 15);
		frame.getContentPane().add(passWord);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(136, 82, 263, 25);
		frame.getContentPane().add(passwordField);
		
		chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setBounds(156, 113, 148, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		LoginButton = new JButton("Login");
		LoginButton.setToolTipText("");
		LoginButton.setFont(new Font("Arial", Font.BOLD, 10));
		LoginButton.setBounds(156, 156, 148, 26);
		LoginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {LoginButton(evt);}
		});
		frame.getContentPane().add(LoginButton);
		
		CancelButton = new JButton("Exit");
		CancelButton.setToolTipText("");
		CancelButton.setFont(new Font("Arial", Font.BOLD, 10));
		CancelButton.setBounds(448, 262, 51, 26);
		CancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				CancelButton(e);}
		});
		frame.getContentPane().add(CancelButton);
		
		JLabel signUplabel = new JLabel("Don't you have an account?");
		signUplabel.setHorizontalAlignment(SwingConstants.LEFT);
		signUplabel.setFont(new Font("Candara", Font.PLAIN, 14));
		signUplabel.setBounds(128, 214, 175, 15);
		frame.getContentPane().add(signUplabel);
		
		JLabel signUP_1 = new JLabel("Sign up");
		signUP_1.setForeground(Color.BLUE);
		signUP_1.setFont(new Font("Candara", Font.PLAIN, 14));
		signUP_1.setBounds(302, 214, 97, 15);
		signUP_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signUP_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {signUP(e);}
		});
		frame.getContentPane().add(signUP_1);
		
		
		
	}
	
	private void LoginButton(ActionEvent evt) {
		String username =  userTextBox.getText();
		String password = String.valueOf(passwordField.getPassword());


		boolean found = false;
		for (Accounts acc : Main.content.getAccounts()) {
			if (username.equals(acc.getUsername())) {
				if (password.equals(acc.getPassword())) {
					if (chckbxNewCheckBox.isSelected()) Main.rememberMe.write(username, password);
					else Main.rememberMe.write("-", "-");
					JOptionPane.showMessageDialog(null, "Login Successful");
					found = true;
					frame.setVisible(false);
					Main.showWS();
				}
			}
		}
		if (!found) JOptionPane.showMessageDialog(null, "Invalid Username or Password");
	}

//		
	
	private void CancelButton(ActionEvent evt) {
		JOptionPane.showMessageDialog(frame, "Thank you!");
		frame.dispose();
		
	}
	
	private void signUP(java.awt.event.MouseEvent e) {
		JOptionPane.showMessageDialog(frame, "You have to create an account!");
		frame.setVisible(false);
		Main.displaySignUP();
	}
}

