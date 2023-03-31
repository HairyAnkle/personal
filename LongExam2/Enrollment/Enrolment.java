package Enrollment;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Enrolment {

	JFrame frame;
	private JTextField idNumberField;
	private JTextField fNameField;
	private JTextField lNameField;
	private JTextField studentTypeField;
	private JTextField courseField;
	public JTextField totalTuitionFee;
	private JLabel FirstName;
	private JLabel idNumber;
	private JLabel note;
	private JLabel EnrollmentTitle;
	private JLabel LastName;
	private JLabel StudentType;
	private JLabel Course;
	private JButton calculateButton;

	
	/**
	 * Create the application.
	 */
	
	public Enrolment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 843, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		FirstName.setBounds(34, 102, 63, 16);
		frame.getContentPane().add(FirstName);
		
		idNumber = new JLabel("ID Number");
		idNumber.setFont(new Font("AppleGothic", Font.PLAIN, 11));
		idNumber.setBounds(34, 62, 63, 16);
		frame.getContentPane().add(idNumber);
		
		idNumberField = new JTextField();
		idNumberField.setColumns(10);
		idNumberField.setBackground(new Color(231, 239, 236));
		idNumberField.setBounds(34, 78, 130, 26);
		frame.getContentPane().add(idNumberField);
		
		note = new JLabel("Kindly enter the following information.");
		note.setForeground(Color.LIGHT_GRAY);
		note.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		note.setBounds(34, 43, 249, 16);
		frame.getContentPane().add(note);
		
		EnrollmentTitle = new JLabel("Enrollment Page");
		EnrollmentTitle.setForeground(Color.BLACK);
		EnrollmentTitle.setFont(new Font("Bodoni 72 Smallcaps", Font.BOLD, 24));
		EnrollmentTitle.setBounds(123, -1, 223, 60);
		frame.getContentPane().add(EnrollmentTitle);
		
		fNameField = new JTextField();
		fNameField.setColumns(10);
		fNameField.setBackground(new Color(231, 239, 236));
		fNameField.setBounds(34, 116, 130, 26);
		frame.getContentPane().add(fNameField);
		
		LastName = new JLabel("Last Name");
		LastName.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		LastName.setBounds(34, 147, 63, 16);
		frame.getContentPane().add(LastName);
		
		lNameField = new JTextField();
		lNameField.setColumns(10);
		lNameField.setBackground(new Color(231, 239, 236));
		lNameField.setBounds(34, 164, 130, 26);
		frame.getContentPane().add(lNameField);
		
		StudentType = new JLabel("Student Type");
		StudentType.setFont(new Font("AppleGothic", Font.PLAIN, 11));
		StudentType.setBounds(186, 62, 130, 16);
		frame.getContentPane().add(StudentType);
		
		studentTypeField = new JTextField();
		studentTypeField.setColumns(10);
		studentTypeField.setBackground(new Color(231, 239, 236));
		studentTypeField.setBounds(187, 78, 130, 26);
		frame.getContentPane().add(studentTypeField);
		
		Course = new JLabel("Course");
		Course.setFont(new Font("AppleGothic", Font.PLAIN, 11));
		Course.setBounds(186, 102, 130, 16);
		frame.getContentPane().add(Course);
		
		courseField = new JTextField();
		courseField.setColumns(10);
		courseField.setBackground(new Color(231, 239, 236));
		courseField.setBounds(186, 116, 130, 26);
		frame.getContentPane().add(courseField);
		
		totalTuitionFee = new JTextField();
		totalTuitionFee.setHorizontalAlignment(SwingConstants.CENTER);
		totalTuitionFee.setEditable(false);
		totalTuitionFee.setFont(new Font("Tahoma", Font.PLAIN, 30));
		totalTuitionFee.setBackground(new Color(231, 239, 236));
		totalTuitionFee.setColumns(10);
		totalTuitionFee.setBounds(363, 78, 336, 161);
		frame.getContentPane().add(totalTuitionFee);
		
		calculateButton= new JButton("Calculate");
		calculateButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 12));
		calculateButton.setBounds(29, 213, 287, 26);
		frame.getContentPane().add(calculateButton);
		calculateButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {feeButtonActionPerformed(evt);}

		});

		JButton logoutButton = new JButton("Log Out");
		logoutButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 12));
		logoutButton.setBounds(363, 287, 80, 25);
		frame.getContentPane().add(logoutButton);
		logoutButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {logoutButtonActionPerformed(evt);}

		});
		
	}
		
	private void feeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		Student enroll = new Student(idNumber.getText(), fNameField.getText(), lNameField.getText(), studentTypeField.getText(), courseField.getText());
		totalTuitionFee.setText(String.valueOf(enroll.total));
		this.frame.setVisible(false);
		Main.displayEnrollment();
	}

	private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.frame.setVisible(false);
		Main.displayMain();
	}
}
