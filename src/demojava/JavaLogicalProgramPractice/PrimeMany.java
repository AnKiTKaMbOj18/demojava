package demojava.JavaLogicalProgramPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeMany {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number from which you want your prime number");

		int p1 = sc.nextInt();

		System.out.println("enter number till you want your prime number");

		int p2 = sc.nextInt();

		List<Integer> prime = new ArrayList<>();

		int i = 2;
		for (int p = p1; p < p2; p++) {

			for (i = 2; i < 10; i++) {
				if (p % i == 0 && p != 0) {
					break;
				}
			}
			if (i == 10) {
				prime.add(p);
			}
		}
		System.out.println("prime between " + p1 + " and " + p2 + " are : ");
		for (int j = 0; j < prime.size(); j++) {
			System.out.println(prime.get(j));
		}
	}
}
