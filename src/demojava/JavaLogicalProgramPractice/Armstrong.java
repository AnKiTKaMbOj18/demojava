package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		System.out.println(7 * 7 * 7 + 0 * 0 * 0 + 4 * 4 * 4);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number which u want to check whether it is armstrong or not");
		int n = sc.nextInt();

		int a, r, s;
		a = n;
		r = 0;
		s = 0;

		while (a != 0) {

			r = a % 10;
			a = a / 10;

			s = s + r * r * r;
		}
		if (s == n) {
			System.out.println("the entered number " + n + " is armstrong  number");
		} else {
			System.out.println("entered number " + n + " is not armstrong ");
		}
	}
}
