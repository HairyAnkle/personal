package exam;

public class Password {
	
	public static boolean isValid(String pass) {
        System.out.println(pass);
        if (pass == null) {return false;} //check if null
        if (pass.length() < 8) {System.out.println("length"); return false;} //check the length
        return true;

    }

}
