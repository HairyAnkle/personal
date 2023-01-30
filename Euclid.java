package monday;

import java.io.*;
import java.util.Scanner; // import for scanner

class Euclid {
    private static Scanner sc = new Scanner(System.in); // scanner
    
    public static double gcd(double input1, double input2) { // recursion function for Euclid's Algorithm to find the GCD of the user's input
        if (input2 == 0){ 
            return input1;
        }
        else {
            return gcd(input2, input1 % input2); // formula for finding the GCD of two integers using Euclid's Algorithm
        }
    }

    static boolean isPalindrome(int input) {
        int temp = input;
        int reverse = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }
        return input == reverse;
    }

    public static void main(String[] args) throws IOException { // main method
        int input1, input2;  // initializing inputs for the user 
        double Gcd;
        

        System.out.println("Enter the 1st number");
        input1 = sc.nextInt(); 
        System.out.println("Enter the 2nd number");
        input2 = sc.nextInt();

        Gcd = gcd(input1, input2);

        FileWriter fw = new FileWriter("tite.txt");
        PrintWriter print = new PrintWriter(fw);

        if(isPalindrome(input1) == true)
            print.println(input1 + " is a PALINDROME");
        else
            print.println(input1 + " is NOT A PALINDROME");

        if(isPalindrome(input2) == true)
            print.println(input2 + " is a PALINDROME");
        else
            print.println(input2 + " is NOT A PALINDROME");

        print.println("The GCD of these two integers is " + Gcd); // function call.   NOTE : print.println is similar to sout print but print.println will create new file for the output of the final answer.
        print.println("Suggested Password: " + input1 + "-" + input2 + "-" + Gcd);
        print.close();
    }
    
}
