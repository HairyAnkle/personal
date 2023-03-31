package Enrollment;

import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;

import java.awt.event.MouseAdapter;

public class MainFrame{

	JFrame frame;
	private JTextField userTextBox;
	private JPasswordField passwordField;
	private JLabel Title;
	private JLabel lblLogin;
	private JLabel userName;
	private JLabel passWord;
	private JCheckBox chckbxNewCheckBox;
	private JButton LoginButton;	
	private JButton CancelButton;
	private JLabel Login;
	private JLabel Cancel;
	private JLabel signUplabel;
	private JLabel signUP;
	private JLabel fyp;


	/**
	 * Create the application. 
	 */
	
	public MainFrame() {
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
		frame.setBounds(100, 100, 523, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Title = new JLabel("GitHub");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setFont(new Font("Arial Black", Font.PLAIN, 32));
		Title.setBounds(159, 38, 202, 30);
		frame.getContentPane().add(Title);
		
		lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Consolas", Font.PLAIN, 33));
		lblLogin.setBackground(Color.LIGHT_GRAY);
		lblLogin.setBounds(200, 78, 136, 49);
		frame.getContentPane().add(lblLogin);
		
		userTextBox = new JTextField();
		userTextBox.setColumns(10);
		userTextBox.setBounds(139, 160, 263, 25);
		frame.getContentPane().add(userTextBox);
		
		userName = new JLabel("Username");
		userName.setFont(new Font("Candara", Font.PLAIN, 14));
		userName.setBackground(Color.LIGHT_GRAY);
		userName.setBounds(67, 167, 62, 15);
		frame.getContentPane().add(userName);
		
		passWord = new JLabel("Password");
		passWord.setFont(new Font("Candara", Font.PLAIN, 14));
		passWord.setBounds(67, 202, 70, 15);
		frame.getContentPane().add(passWord);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 195, 263, 25);
		frame.getContentPane().add(passwordField);
		
		chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setBounds(159, 226, 148, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		LoginButton = new JButton("");
		LoginButton.setToolTipText("");
		LoginButton.setFont(new Font("Arial", Font.BOLD, 10));
		LoginButton.setBounds(159, 254, 51, 41);
		LoginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {LoginButton(evt);}
		});
		frame.getContentPane().add(LoginButton);
		
		CancelButton = new JButton("");
		CancelButton.setToolTipText("");
		CancelButton.setFont(new Font("Arial", Font.BOLD, 10));
		CancelButton.setBounds(279, 254, 51, 41);
		CancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {CancelButton(evt);}
		});
		frame.getContentPane().add(CancelButton);
		
		Login = new JLabel("Login");
		Login.setFont(new Font("Candara", Font.PLAIN, 14));
		Login.setBounds(214, 269, 70, 15);
		frame.getContentPane().add(Login);
		
		Cancel = new JLabel("Cancel");
		Cancel.setFont(new Font("Candara", Font.PLAIN, 14));
		Cancel.setBounds(332, 269, 70, 15);
		frame.getContentPane().add(Cancel);
		
		signUplabel = new JLabel("Don't you have an account?");
		signUplabel.setHorizontalAlignment(SwingConstants.LEFT);
		signUplabel.setFont(new Font("Candara", Font.PLAIN, 14));
		signUplabel.setBounds(153, 333, 175, 15);
		frame.getContentPane().add(signUplabel);
		
		signUP = new JLabel("Sign up");
		signUP.setForeground(Color.BLUE);
		signUP.setFont(new Font("Candara", Font.PLAIN, 14));
		signUP.setBounds(327, 333, 97, 15);
		signUP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signUP.addMouseListener(new MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {signUP(e);}
		});
		frame.getContentPane().add(signUP);
		
		fyp = new JLabel("Forgot your password?");
		fyp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {fyp(e);}
		});
		fyp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fyp.setForeground(Color.BLUE);
		fyp.setFont(new Font("Candara", Font.PLAIN, 14));
		fyp.setBounds(200, 358, 152, 15);
		frame.getContentPane().add(fyp);
		
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/rsz_brand-github-filled_1.png")).getImage();
		logo.setIcon(new ImageIcon(img));
		logo.setBounds(113, 38, 83, 67);
		frame.getContentPane().add(logo);
	}
	
	private void LoginButton(ActionEvent evt) {
		String username =  userTextBox.getText().toLowerCase();
		String password = String.valueOf(passwordField.getPassword());


		boolean found = false;
		for (Account acc : Main.accContent.getAccounts()) {
			if (username.equals(acc.getUsername())) {
				if (password.equals(acc.getPassword())) {
					if (chckbxNewCheckBox.isSelected()) 
						Main.remember.write(username, password);
					else 
						Main.remember.write("-", "-");
					JOptionPane.showMessageDialog(null, "Login Successful");
					found = true;
					frame.setVisible(false);
					Main.displayEnrollment();
				}
			}
		}
		if (!found) 
			JOptionPane.showMessageDialog(null, "Invalid Username or Password");
	}
			
	private void CancelButton(ActionEvent evt) {
		JOptionPane.showMessageDialog(frame, "Thank you!");
		frame.dispose();
		
	}
	
	private void signUP(java.awt.event.MouseEvent e) {
		JOptionPane.showMessageDialog(frame, "You have to create an account!");
		frame.setVisible(false);
		Main.displaySUP();
	}
	
	private void fyp(java.awt.event.MouseEvent e) {
		JOptionPane.showMessageDialog(frame, "Forgot your password?");
		ForgotPassword.show();
	}
}

