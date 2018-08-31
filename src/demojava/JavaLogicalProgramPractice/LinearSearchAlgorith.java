package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class LinearSearchAlgorith {

	public static void main(String[] args) {
		int counter, number, sitem, array[];
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter number of elements");

		number = sc.nextInt();

		array = new int[number];

		System.out.println("enter " + number + " integers");

		for (counter = 0; counter < number; counter++)
			array[counter] = sc.nextInt();

		System.out.println("enter the search value");

		sitem = sc.nextInt();

		for (counter = 0; counter < number; counter++) {
			if (array[counter] == sitem) {
				System.out.println(sitem + " is present at location " + (counter + 1));
				break;
			}
		}
		if (counter == number) {
			System.out.println(sitem + " doesn't exist in list");
		}
	}
}
