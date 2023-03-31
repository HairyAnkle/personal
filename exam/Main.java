package exam;

public class Main {
	
	public static AccountIfo content = new AccountIfo("D:\\Users\\ogena\\eclipse-workspace\\FinalExam\\assets\\account"); //it will store the data from signUP
	public static Remember rememberMe = new Remember("D:\\Users\\ogena\\eclipse-workspace\\FinalExam\\assets\\stored data.txt"); //it will store the data to remember the account you signed up
	public static LoginExam Login = new LoginExam(); //object for loginpage
	public static SignUP sUP = new SignUP();  //object for signup
	public static ExamModule Exam = new ExamModule(); //object for exam
	public static WelcomeScreen ws = new WelcomeScreen(); // object for welcome screen
	public static EndExam ex = new EndExam(); //object for endexam
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		displayLoginExam();
		
	}
	//function call for LoginExam
	public static void displayLoginExam() {
		Login.frame.setVisible(true);
	}
	
	//function call for SignUP
	public static void displaySignUP() {
		sUP.frame.setVisible(true);
	}
	
	//function call for Exam
	public static void showExam() {
		Exam.frame.setVisible(true);
	}
	
	//function call for EndofExam
	public static void showWS() {
		ws.frame.setVisible(true);
	}
	
	public static void showEX() {
		ex.frame.setVisible(true);
	}
	

}
