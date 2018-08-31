package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter number greater than 2");

		int p = input.nextInt();

		int i = 2;
		for (i = 2; i < 10; i++) {
			if (p % i == 0 && p != i) {
				System.out.println("entered number " + p + " is not prime number");
				break;
			}
		}
		if (i == 10) {
			System.out.println("entered number" + p + " is prime number");
		}

	}
}
