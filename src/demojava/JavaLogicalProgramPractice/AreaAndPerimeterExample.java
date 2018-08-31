package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class AreaAndPerimeterExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter values");

		double area;
		double perimeter;
		int r;

		r = scan.nextInt();

		area = Math.PI * r * r;
		System.out.println("area of circle is " + area);

		perimeter = 2 * Math.PI * r;
		System.out.println("perimeter of circle is " + perimeter);
	}
	
}
