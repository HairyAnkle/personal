package Enrollment;

public class Main {
	
	public static RememberMe remember = new RememberMe("D:\\Users\\ogena\\eclipse-workspace\\Enrollment\\src\\Enrollment\\Assets\\Stored Data.txt");
	public static AccContent accContent = new AccContent("D:\\Users\\ogena\\eclipse-workspace\\Enrollment\\src\\Enrollment\\Assets\\accInfo.txt");
	public static MainFrame login = new MainFrame();
	public static signUp sUP = new signUp();
	public static Enrolment enrollment = new Enrolment();

	/**
	 * Launch the application.
	 */
	
	public static void main(String [] args) {
		displayMain();
	}
	
	public static void displayEnrollment() {
		enrollment.frame.setVisible(true);
	}
	
	public static void displayMain() {
		login.frame.setVisible(true);
	}
	
	public static void displaySUP() {
		sUP.frame.setVisible(true);
	}

}
