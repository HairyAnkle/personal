package wWinbuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class ForgotPassword extends JFrame implements ActionListener {

	JLabel titleLabel, emailLabel, passwordLabel;
    JTextField emailField;
    JPasswordField passwordField;
    JButton loginButton, forgotPasswordButton;
	protected Object frame;

	/**
	 * Launch the application.

	/**
	 * Create the application.
	 */
	public ForgotPassword() {
		setTitle("Sign in to GitHub");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add components to the frame
        titleLabel = new JLabel("Sign in to GitHub");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        emailLabel = new JLabel("Email address");
        emailField = new JTextField(20);
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Sign in");
        forgotPasswordButton = new JButton("Forgot password?");

        // Set layout and add components
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(titleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(passwordField, gbc);

        // Add action listeners to the login and forgot password buttons
        loginButton.addActionListener(this);
        forgotPasswordButton.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(loginButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(forgotPasswordButton, gbc);

        // Make the frame visible
        setVisible(true);
    }

    // Handle action events
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } else if (ae.getSource() == forgotPasswordButton) {
            JOptionPane.showMessageDialog(this, "Please contact support to reset your password.", "Forgot password", JOptionPane.INFORMATION_MESSAGE);
        }
	}

	/**
	 * Initialize the contents of the frame.
	 */

}
