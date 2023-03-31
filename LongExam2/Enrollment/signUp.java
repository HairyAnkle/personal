package Enrollment;

import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class signUp {

	
	JFrame frame;
	private JTextField EmailField;
	private JTextField fullnameField;
	private JTextField usernameField;
	private JTextField passwordField;
	private JLabel GitHubLabel;
	private JLabel signUpLabel;
	private	JLabel Logo;
	private JButton signUpBtn;
	
	/**
	 * Create the application.
	 */
	
	public signUp() {
		initialize();
		frame.setVisible(false);
		frame.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 604, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		GitHubLabel = new JLabel("Join GitHub");
		GitHubLabel.setHorizontalAlignment(SwingConstants.LEFT);
		GitHubLabel.setForeground(Color.BLACK);
		GitHubLabel.setFont(new Font("Apple Chancery", Font.BOLD, 24));
		GitHubLabel.setBounds(35, 10, 195, 60);
		frame.getContentPane().add(GitHubLabel);
		
		signUpLabel = new JLabel("The best way design, build, and ship software");
		signUpLabel.setForeground(Color.GRAY);
		signUpLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		signUpLabel.setBounds(35, 54, 249, 16);
		frame.getContentPane().add(signUpLabel);
		
		JLabel emailLabel = new JLabel("Email Address");
		emailLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		emailLabel.setBounds(53, 272, 97, 16);
		frame.getContentPane().add(emailLabel);
		
		JLabel fullNameLabel = new JLabel("Full Name");
		fullNameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		fullNameLabel.setBounds(53, 135, 82, 16);
		frame.getContentPane().add(fullNameLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		usernameLabel.setBounds(53, 200, 82, 16);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		passLabel.setBounds(53, 341, 82, 16);
		frame.getContentPane().add(passLabel);
		
		EmailField = new JTextField();
		EmailField.setColumns(10);
		EmailField.setBackground(new Color(231, 239, 236));
		EmailField.setBounds(53, 286, 322, 26);
		frame.getContentPane().add(EmailField);
		
		fullnameField = new JTextField();
		fullnameField.setColumns(10);
		fullnameField.setBackground(new Color(231, 239, 236));
		fullnameField.setBounds(53, 150, 322, 26);
		frame.getContentPane().add(fullnameField);
		
		usernameField = new JTextField();
		usernameField.setColumns(10);
		usernameField.setBackground(new Color(231, 239, 236));
		usernameField.setBounds(53, 218, 322, 26);
		frame.getContentPane().add(usernameField);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBackground(new Color(231, 239, 236));
		passwordField.setBounds(52, 355, 323, 26);
		frame.getContentPane().add(passwordField);
		
		signUpBtn = new JButton("Sign up");
		signUpBtn.setFont(new Font("Arial", Font.BOLD, 14));
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.setBackground(SystemColor.window);
		signUpBtn.setBounds(53, 403, 249, 29);
		frame.getContentPane().add(signUpBtn);
		signUpBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				enterActionPerformed(evt);
				}
		});
		
		JLabel bySigningLabel = new JLabel("By signing up, you agree to our Terms, Data Policy and Cookies Policy.");
		bySigningLabel.setForeground(Color.LIGHT_GRAY);
		bySigningLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		bySigningLabel.setBounds(10, 442, 353, 16);
		frame.getContentPane().add(bySigningLabel);
		
		JLabel haveAnLabel = new JLabel("Have an account?");
		haveAnLabel.setForeground(Color.LIGHT_GRAY);
		haveAnLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		haveAnLabel.setBounds(10, 456, 97, 16);
		frame.getContentPane().add(haveAnLabel);
		
		JLabel logInLabel = new JLabel("Log In");
		logInLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LogIn(e);
				}
		});
		logInLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logInLabel.setForeground(Color.BLUE);
		logInLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		logInLabel.setBounds(93, 454, 63, 16);
		frame.getContentPane().add(logInLabel);
		
		JLabel GitHubLabel_1 = new JLabel("Create your Account");
		GitHubLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GitHubLabel_1.setForeground(Color.BLACK);
		GitHubLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		GitHubLabel_1.setBounds(35, 80, 268, 45);
		frame.getContentPane().add(GitHubLabel_1);
		
		JLabel lblInputYourFull = new JLabel("Input your Full Name.");
		lblInputYourFull.setForeground(Color.GRAY);
		lblInputYourFull.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblInputYourFull.setBounds(53, 174, 249, 16);
		frame.getContentPane().add(lblInputYourFull);
		
		JLabel lblThisWillBe = new JLabel("This will be your username. You can add the name of your organization later.");
		lblThisWillBe.setForeground(Color.GRAY);
		lblThisWillBe.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblThisWillBe.setBounds(53, 241, 322, 16);
		frame.getContentPane().add(lblThisWillBe);
		
		JLabel lblWellOccasionallySend = new JLabel("We'll occasionally send updates about your account to this inbox. We'll never\r\n");
		lblWellOccasionallySend.setVerticalAlignment(SwingConstants.TOP);
		lblWellOccasionallySend.setForeground(Color.GRAY);
		lblWellOccasionallySend.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblWellOccasionallySend.setBounds(53, 311, 412, 26);
		frame.getContentPane().add(lblWellOccasionallySend);
		
		JLabel lblWellOccasionallySend_1 = new JLabel("share your email address with anyone.");
		lblWellOccasionallySend_1.setVerticalAlignment(SwingConstants.TOP);
		lblWellOccasionallySend_1.setForeground(Color.GRAY);
		lblWellOccasionallySend_1.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblWellOccasionallySend_1.setBounds(53, 322, 412, 26);
		frame.getContentPane().add(lblWellOccasionallySend_1);
		
		JLabel lblThisIsYour = new JLabel("This is your password.");
		lblThisIsYour.setVerticalAlignment(SwingConstants.TOP);
		lblThisIsYour.setForeground(Color.GRAY);
		lblThisIsYour.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblThisIsYour.setBounds(53, 382, 412, 26);
		frame.getContentPane().add(lblThisIsYour);
		
		Logo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/brand-github.png")).getImage();
		Logo.setIcon(new ImageIcon(img));
		Logo.setBounds(363, 113, 217, 244);
		frame.getContentPane().add(Logo);
		
		JButton backButton = new JButton("Back");
		backButton.setFont(new Font("Arial", Font.BOLD, 13));
		backButton.setBounds(444, 403, 97, 29);
		backButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				backActionPerformed(e);
			}
		});
		frame.getContentPane().add(backButton);
	}
	
	private void enterActionPerformed(java.awt.event.ActionEvent evt) {
		if (!Password.isValid(passwordField.getText())) { 
			JOptionPane.showMessageDialog(null, "Your password is weak.");
			
		} else {
			Main.accContent.addAcc(usernameField.getText(), passwordField.getText());
			Main.accContent.write();
			JOptionPane.showMessageDialog(null, "Registered Successfully");
			frame.setVisible(false);
			Main.displayMain();
		}
	}
	
	private void LogIn(java.awt.event.MouseEvent e) {
		JOptionPane.showMessageDialog(frame, "Log in your account again!");
		Main.displayMain();
	}
	
	private void backActionPerformed(java.awt.event.ActionEvent e) {
		Main.displayMain();
		frame.dispose();
	}
}
