package exam;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EndExam {

	JFrame frame;

	/**
	 * Create the application.
	 */
	
	public EndExam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("END OF FINALS EXAM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel.setBounds(22, 40, 392, 130);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(167, 149, 85, 21);
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				buttonPerformed(e);}
		});
		frame.getContentPane().add(btnNewButton);
	}
	
	private void buttonPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(frame, "You have successfully logout you account!");
		frame.dispose();
		Main.displayLoginExam();
	}
}
