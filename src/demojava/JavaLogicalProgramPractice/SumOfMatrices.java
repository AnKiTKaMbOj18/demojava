package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class SumOfMatrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows for matrix");
		System.out.println("enter cols for matrix");
		int rows, cols, c, d;

		rows = sc.nextInt();
		cols = sc.nextInt();

		int first[][] = new int[rows][cols];
		int second[][] = new int[rows][cols];
		int sum[][] = new int[rows][cols];

		System.out.println("enter elements of first matrix");
		for (c = 0; c < rows; c++)
			for (d = 0; d < cols; d++)
				first[c][d] = sc.nextInt();

		System.out.println("enter elements of second matrix");
		for (c = 0; c < rows; c++)
			for (d = 0; d < cols; d++)
				second[c][d] = sc.nextInt();

		for (c = 0; c < rows; c++)
			for (d = 0; d < cols; d++)
				sum[c][d] = first[c][d] + second[c][d]; // replace + with - for subtract matrices

		System.out.println("sum of entered matrices");

		for (c = 0; c < rows; c++) {
			for (d = 0; d < cols; d++)
				System.out.print(sum[c][d] + " \t");
			System.out.println();
		}

	}

}
