package Enrollment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Password {
	
	public static boolean isValid(String pass) {
		
        System.out.println(pass);
        
        //check if null
        if (pass == null) {
        	return false;
        } 
        
        //check the length
        if (pass.length() < 8) {
        	System.out.println("length");
        	return false;
        } 

        // check for special char
        Pattern SCP = Pattern.compile("[!@#$%^&*]");
        Matcher SCM = SCP.matcher(pass);
        if (!SCM.find()) {
        	System.out.println("error spec"); 
        	return false;
        }

        // check for number
        Pattern numP = Pattern.compile("[0-9]");
        Matcher numM = numP.matcher(pass);
        if (!numM.find()) {
        	System.out.println("num");
        	return false;
        }

        // check for upper case and lower case
        Pattern upperP = Pattern.compile("[A-Z]");
        Matcher upperM = upperP.matcher(pass);
        if(!upperM.find()) {
        	System.out.println("upper");
        	return false;
        }

        Pattern lowerP = Pattern.compile("[a-z]");
        Matcher lowerM = lowerP.matcher(pass);
        if(!lowerM.find()) {
        	System.out.println("lower");
        	return false;
        }

        return true;



    }

}
