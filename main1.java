package monday;

import java.util.Scanner;

public class main1 {
    
    static Scanner sc = new Scanner(System.in);
    
     public static int factorial(int input) {
        if (input > 0) {
            return input * factorial(input - 1);
        }
        else {
            return 1;
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
     public static void main(String[] args) {
        System.out.println("Input a number");
        int input = sc.nextInt();
        System.out.println(input + "! is " + factorial(input));

        if (isPalindrome(input) == true) {
            System.out.println("The factorial is a palindrome.");
        } else {
            System.out.println("The factorial is not a palindrome.");
        }
        System.out.println("Suggested Password: " + input + "-" + factorial(input));
    }   
}


