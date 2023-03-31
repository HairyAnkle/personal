package exam;

import javax.swing.*;

public class ExamModule {

	JFrame frame;


	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ExamModule() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 frame = new JFrame();
		 frame.setTitle("Exam");
		 frame.setSize(400, 250);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setLayout(null);

         // Add a label to the exam frame
         JLabel label = new JLabel("Question#1: Who originally developed the Java Programming Language? ");
         label.setBounds(50, 50, 450, 20);
         frame.add(label);

         // Add radio buttons to the exam frame
         JRadioButton option1 = new JRadioButton("Timberners-Lee");
         option1.setBounds(50, 80, 400, 20);
         frame.add(option1);

         JRadioButton option2 = new JRadioButton("Guido Van Rossum");
         option2.setBounds(50, 100, 400, 20);
         frame.add(option2);

         JRadioButton option3 = new JRadioButton("James Gosling");
         option3.setBounds(50, 120, 400, 20);
         frame.add(option3);

         JRadioButton option4 = new JRadioButton("Mark Zuckerberg");
         option4.setBounds(50, 140, 400, 20);
         frame.add(option4);

         ButtonGroup group = new ButtonGroup();
         group.add(option1);
         group.add(option2);
         group.add(option3);
         group.add(option4);

         // Add a button to submit the answer
         JButton submitBtn = new JButton("Submit");
         submitBtn.setBounds(150, 180, 100, 30);
         submitBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (option3.isSelected()) {
					JOptionPane.showMessageDialog(frame, "YOUR ANSWER IS CORRECT");
					frame.dispose();
					Main.showEX();
				} else {
					JOptionPane.showMessageDialog(frame, "PLEASE TRY AGAIN");
				}
			}
			});
         frame.add(submitBtn);

	}

	


}
