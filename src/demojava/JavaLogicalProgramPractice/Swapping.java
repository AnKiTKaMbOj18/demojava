package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter first number");

		int x = input.nextInt();

		System.out.println("enter second number");
		int y = input.nextInt();

		System.out.println("initial value of x is " + x + " and y is " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("after swapping value of x is " + x + " and y is " + y);
	}
}
