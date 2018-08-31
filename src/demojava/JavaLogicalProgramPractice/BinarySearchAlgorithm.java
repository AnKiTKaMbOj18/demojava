package demojava.JavaLogicalProgramPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		int counter, first, last, middle, number, sitem, array[];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements");
		number = sc.nextInt();

		array = new int[number];

		System.out.println("enter " + number + " integers");

		for (counter = 0; counter < number; counter++)
			array[counter] = sc.nextInt();

		System.out.println("enter value to search");
		sitem = sc.nextInt();

		Arrays.sort(array); // binary search will work on sorted array only so sort first

		first = 0;
		last = number - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < sitem) {
				first = middle + 1;
			} else if (array[middle] == sitem) {
				
				System.out.println(sitem + " found at location " + (middle + 1));
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(sitem + " is not present in the list");

	}
}
