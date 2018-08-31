package demojava.JavaLogicalProgramPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramExample {

	/*
	 * static boolean isAnagram(String a, String b) { // Complete the function if
	 * (a.length() != b.length()) { return false; }
	 * 
	 * char[] chars = a.toCharArray(); for (char c : chars) { int index =
	 * b.indexOf(c);
	 * 
	 * if (index != -1) { b = b.substring(0, index) + b.substring(index + 1,
	 * b.length()); } else return false;
	 * 
	 * }
	 * 
	 * return b.isEmpty(); }
	 */

	static boolean isAnagram(String a, String b) {

		a = a.toLowerCase();
		b = b.toLowerCase();

		char[] c = a.toCharArray();
		Arrays.sort(c);

		char[] d = b.toCharArray();
		Arrays.sort(d);

		String a1 = new String(c);
		String b1 = new String(d);

		if (a1.equals(b1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter values");
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
