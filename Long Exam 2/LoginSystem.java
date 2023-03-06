package wWinbuilder;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;

public class LoginSystem {
		// imports call
		JFrame frame;
	    private JTextField textField;
	    private JPasswordField passwordField;
	    private final Action action = new SwingAction();
	    private JLabel userName;
	    private JLabel passWord;
	    private JButton LoginButton;
	    private JLabel Title;
	    private JLabel lblLogin;
	    private JLabel Login;
	    private JLabel Cancel;
	    private JButton CancelButton;
	    private JLabel lblNewLabel_1_1_2;
	    private JCheckBox chckbxNewCheckBox;
	    private JLabel signUP;
	    private JLabel lblNewLabel_1_1_1_1_1;
	    
	    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
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
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame("GitHub Login");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setBounds(100, 100, 493, 458);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        userName = new JLabel("Username");
        userName.setBounds(34, 159, 62, 15);
        userName.setBackground(Color.LIGHT_GRAY);
        userName.setFont(new Font("Candara", Font.PLAIN, 14));
        frame.getContentPane().add(userName);

        textField = new JTextField();
        textField.setBounds(106, 152, 263, 25);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        passWord = new JLabel("Password");
        passWord.setBounds(34, 194, 70, 15);
        passWord.setFont(new Font("Candara", Font.PLAIN, 14));
        frame.getContentPane().add(passWord);

        passwordField = new JPasswordField();
        passwordField.setBounds(106, 187, 263, 25);
        frame.getContentPane().add(passwordField);

        LoginButton = new JButton("");
        LoginButton.setBounds(126, 246, 51, 41);
        LoginButton.setToolTipText("");
        LoginButton.setFont(new Font("Arial", Font.BOLD, 10));
        LoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("admin") && password.equals("admin")) {
                	JOptionPane.showMessageDialog(frame, "Login successful!");
                    frame.dispose();
                    DiscountSystemGUI dS = new DiscountSystemGUI();
                    ((JComponent) dS.frame).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password!");
                }
            }
        });
        frame.getContentPane().add(LoginButton);
        

        
        Title = new JLabel("GitHub");
        Title.setBounds(146, 30, 185, 30);
        Title.setFont(new Font("Arial Black", Font.PLAIN, 22));
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(Title);
        
        lblLogin = new JLabel("Login");
        lblLogin.setBounds(172, 70, 136, 49);
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setFont(new Font("Consolas", Font.PLAIN, 35));
        lblLogin.setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().add(lblLogin);
        
        Login = new JLabel("Login");
        Login.setBounds(181, 261, 70, 15);
        Login.setFont(new Font("Candara", Font.PLAIN, 14));
        frame.getContentPane().add(Login);
        
        Cancel = new JLabel("Cancel");
        Cancel.setBounds(299, 261, 70, 15);
        Cancel.setFont(new Font("Candara", Font.PLAIN, 14));
        frame.getContentPane().add(Cancel);
        
        lblNewLabel_1_1_2 = new JLabel("Don't you have an account?");
        lblNewLabel_1_1_2.setBounds(120, 325, 175, 15);
        lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1_2.setFont(new Font("Candara", Font.PLAIN, 14));
        frame.getContentPane().add(lblNewLabel_1_1_2);
        
        CancelButton = new JButton("");
        CancelButton.setBounds(246, 246, 51, 41);
        CancelButton.setAction(action);
        CancelButton.setToolTipText("");
        CancelButton.setFont(new Font("Arial", Font.BOLD, 10));
        CancelButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(frame, "Exit Success!");
                frame.dispose();     
            }
        }
        		);
        frame.getContentPane().add(CancelButton);
        
        chckbxNewCheckBox = new JCheckBox("Remember me");
        chckbxNewCheckBox.setBounds(126, 218, 148, 21);
        frame.getContentPane().add(chckbxNewCheckBox);
        
        signUP = new JLabel("Sign up");
        signUP.setBounds(294, 325, 62, 15);
        signUP.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(frame, "You have to create an account!");
        		frame.dispose();
        		SignUp1 sUP = new SignUp1();
        		sUP.frame.setVisible(true);
        		
        	}
        });
        signUP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signUP.setForeground(Color.BLUE);
        signUP.setFont(new Font("Candara", Font.PLAIN, 14));
        frame.getContentPane().add(signUP);
        
        lblNewLabel_1_1_1_1_1 = new JLabel("Forgot your password?");
        lblNewLabel_1_1_1_1_1.setBounds(167, 350, 152, 15);
        lblNewLabel_1_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblNewLabel_1_1_1_1_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(frame,"Forgot your passowrd?");
        		frame.dispose();
        		ForgotPassword fp = new ForgotPassword();
        		((JComponent) fp.frame).setVisible(true);
        	}
        });
        lblNewLabel_1_1_1_1_1.setForeground(Color.BLUE); 
        lblNewLabel_1_1_1_1_1.setFont(new Font("Candara", Font.PLAIN, 14));
        frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
        
        
    }
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Sign up");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}



