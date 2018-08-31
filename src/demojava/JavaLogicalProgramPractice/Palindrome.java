package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter rows");
		int n = s1.nextInt();
		int c = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(++c + " ");

			}
			System.out.println(" ");
		}

	}

}
