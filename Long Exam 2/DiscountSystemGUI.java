package wWinbuilder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class DiscountSystemGUI extends JFrame implements ActionListener {

	private JTextField idNumberField;
    private JTextField fNameField;
    private JTextField lNameField;
    private JComboBox<String> studentTypeComboBox;
    private JComboBox<String> courseComboBox;
    private JLabel resultLabel;
    protected Object frame;

    public DiscountSystemGUI() {
        super("Discount System");

        // Create labels and text fields
        JLabel idNumberLabel = new JLabel("ID Number:");
        idNumberField = new JTextField(10);

        JLabel fNameLabel = new JLabel("First Name:");
        fNameField = new JTextField(10);

        JLabel lNameLabel = new JLabel("Last Name:");
        lNameField = new JTextField(10);

        // Create combo boxes
        JLabel studentTypeLabel = new JLabel("Student Type:");
        String[] studentTypes = {"Discounted", "Walk-in", "Continuing"};
        studentTypeComboBox = new JComboBox<String>(studentTypes);
        studentTypeComboBox.addActionListener(this);

        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"Tourism", "Computer Science", "Engineer", "Nursing"};
        courseComboBox = new JComboBox<String>(courses);

        // Create button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        // Create result label
        resultLabel = new JLabel();

        // Create layout and add components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(idNumberLabel, constraints);

        constraints.gridx = 1;
        panel.add(idNumberField, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        panel.add(fNameLabel, constraints);

        constraints.gridx = 1;
        panel.add(fNameField, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        panel.add(lNameLabel, constraints);

        constraints.gridx = 1;
        panel.add(lNameField, constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        panel.add(studentTypeLabel, constraints);

        constraints.gridx = 1;
        panel.add(studentTypeComboBox, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        panel.add(courseLabel, constraints);

        constraints.gridx = 1;
        panel.add(courseComboBox, constraints);

        constraints.gridy = 5;
        constraints.gridx = 1;
        panel.add(calculateButton, constraints);

        constraints.gridy = 6;
        panel.add(resultLabel, constraints);

        add(panel);

        // Set frame properties
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == studentTypeComboBox) {
            String studentType = (String)studentTypeComboBox.getSelectedItem();
            if (studentType.equals("Discounted")) {
                String[] discountTypes = {"Gold", "Blue", "White"};
                String discountType = (String) JOptionPane.showInputDialog(this, "What discount do you have?", "Discount Type", JOptionPane.QUESTION_MESSAGE, null, discountTypes, discountTypes[0]);
                calculateDiscountedTuitionFee(discountType);
            }
        } else if (e.getActionCommand().equals("Calculate")) {
            calculateTuitionFee();
        }
    }

    private void calculateTuitionFee() {
        String idNumber = idNumberField.getText();
        String fName = fNameField.getText();
        String lName = lNameField.getText();
        String course = (String) courseComboBox.getSelectedItem();
        
        // Calculate tuition fee based on course
        double tuitionFee = 0.0;
        switch (course) {
            case "Tourism":
                tuitionFee = 15000.00;
                break;
            case "Computer Science":
                tuitionFee = 18000.00;
                break;
            case "Engineer":
                tuitionFee = 20000.00;
                break;
            case "Nursing":
                tuitionFee = 22000.00;
                break;
        }
    
        // Calculate discount based on student type
        double discount = 0.0;
        String studentType = (String) studentTypeComboBox.getSelectedItem();
        switch (studentType) {
            case "Discounted":
                String[] discountTypes = {"Gold", "Blue", "White"};
                String discountType = (String) JOptionPane.showInputDialog(this, "What discount do you have?", "Discount Type", JOptionPane.QUESTION_MESSAGE, null, discountTypes, discountTypes[0]);
                discount = calculateDiscountedTuitionFee(discountType);
                break;
            case "Walk-in":
                discount = 0.0;
                break;
            case "Continuing":
                discount = 0.05;
                break;
        }
    
        // Calculate total tuition fee
        double totalTuitionFee = tuitionFee - (tuitionFee * discount);
    
        // Display result in a new window
        JFrame resultFrame = new JFrame("Result");
        JPanel resultPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        resultPanel.add(new JLabel("ID Number: " + idNumber), constraints);
    
        constraints.gridy = 1;
        resultPanel.add(new JLabel("Name: " + fName + " " + lName), constraints);
    
        constraints.gridy = 2;
        resultPanel.add(new JLabel("Course: " + course), constraints);
    
        constraints.gridy = 3;
        resultPanel.add(new JLabel("Tuition Fee: " + String.format("%.2f", tuitionFee)), constraints);
    
        constraints.gridy = 4;
        resultPanel.add(new JLabel("Discount: " + String.format("%.2f%%", discount * 100)), constraints);
    
        constraints.gridy = 5;
        resultPanel.add(new JLabel("Total Tuition Fee: " + String.format("%.2f", totalTuitionFee)), constraints);
    
        resultFrame.add(resultPanel);
        resultFrame.pack();
        resultFrame.setVisible(true);
    }
    


private double calculateDiscountedTuitionFee(String discountType) {
    double discount = 0.0;
    switch (discountType) {
        case "Gold":
            discount = 0.2;
            break;
        case "Blue":
            discount = 0.15;
            break;
        case "White":
            discount = 0.1;
            break;
    }
    return discount;
}
}
 