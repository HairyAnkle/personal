package Enrollment;

import javax.swing.*;

public class ForgotPassword {
	
	public static void show() {
		 String username = JOptionPane.showInputDialog(null,"Enter your Username");
	        for (Account acc : Main.accContent.getAccounts()) {
	            if (username.equals(acc.getUsername())) {
	                JOptionPane.showMessageDialog(null, "Your password is " + acc.getPassword());
	                return;
	            }
	        }
	        JOptionPane.showMessageDialog(null, "The username you entered does not exist");
	        show();
	    }
	
	}


