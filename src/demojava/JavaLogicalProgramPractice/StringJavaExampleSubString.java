package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class StringJavaExampleSubString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter values");
		String s = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		// input -->Helloworld 3 7
		// output -->lowo
		String result = s.substring(start, end).trim();
		System.out.println(result);

	}

}
