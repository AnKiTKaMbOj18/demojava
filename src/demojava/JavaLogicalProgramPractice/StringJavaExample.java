package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class StringJavaExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		System.out.println(A.length() + B.length());

		// hello java
		int i = A.compareTo(B);
		if (i > 0) {
			System.out.println("Yes");
		} else
			System.out.println("No");

		String a = A.substring(0, 1).toUpperCase() + A.substring(1);
		String b = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(a + " " + b);
	}
}
