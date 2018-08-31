package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class PalindromeStringReverse {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string which you want to check whether that is palindrome or not: ");
		String s = in.next();
		String r = "";
		
		System.out.println("length of string is "+ s.length());
		
		for (int i = s.length()-1; i >=0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println("Reverse of entered string " + s + " is " + r);
		if (r.equals(s)) {
			System.out.println("String " + s + " is palindrome.");
		} else {
			System.out.println("String " + s + " is not palindrome.");
		}
	}
}
