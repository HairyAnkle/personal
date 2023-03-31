package exam;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;


public class SignUP {

	
	JFrame frame;
	private JTextField usernameField;
	private JTextField passwordField;
	private JButton signUpBtn;
	
	

	/**
	 * Launch the application.
	 *

	/**
	 * Create the application.
	 */
	public SignUP() {
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
		frame.setBounds(100, 100, 493, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		usernameLabel.setBounds(53, 76, 82, 16);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		passLabel.setBounds(54, 138, 82, 16);
		frame.getContentPane().add(passLabel);
		
		usernameField = new JTextField();
		usernameField.setColumns(10);
		usernameField.setBackground(new Color(231, 239, 236));
		usernameField.setBounds(53, 90, 322, 26);
		frame.getContentPane().add(usernameField);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBackground(new Color(231, 239, 236));
		passwordField.setBounds(53, 152, 323, 26);
		frame.getContentPane().add(passwordField);
		
		signUpBtn = new JButton("Sign up");
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.setBackground(SystemColor.window);
		signUpBtn.setBounds(53, 200, 249, 29);
		frame.getContentPane().add(signUpBtn);
		signUpBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				enterActionPerformed(evt);
				}
		});
		
		JLabel GitHubLabel_1 = new JLabel("Create your Account");
		GitHubLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GitHubLabel_1.setForeground(Color.BLACK);
		GitHubLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		GitHubLabel_1.setBounds(30, 10, 268, 45);
		frame.getContentPane().add(GitHubLabel_1);
		
		JLabel lblThisWillBe = new JLabel("This will be your username. You can add the name of your organization later.");
		lblThisWillBe.setForeground(Color.GRAY);
		lblThisWillBe.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblThisWillBe.setBounds(53, 114, 322, 16);
		frame.getContentPane().add(lblThisWillBe);
		
		JLabel lblThisIsYour = new JLabel("This is your password.");
		lblThisIsYour.setVerticalAlignment(SwingConstants.TOP);
		lblThisIsYour.setForeground(Color.GRAY);
		lblThisIsYour.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblThisIsYour.setBounds(53, 177, 412, 26);
		frame.getContentPane().add(lblThisIsYour);
		
	}
	
	private void enterActionPerformed(java.awt.event.ActionEvent evt) {
		if (!Password.isValid(passwordField.getText())) { JOptionPane.showMessageDialog(null, "Your password is weak.");}
		else {
			Main.content.addAcc(usernameField.getText(), passwordField.getText());
			Main.content.write();
			JOptionPane.showMessageDialog(null, "Registered Successfully");
			frame.setVisible(false);
			Main.displayLoginExam();
		}
	}
}
