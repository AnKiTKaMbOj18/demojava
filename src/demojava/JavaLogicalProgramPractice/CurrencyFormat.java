package demojava.JavaLogicalProgramPractice;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double payment = sc.nextDouble();
		sc.close();

		// Write your code here.
		NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
		NumberFormat chFormat = NumberFormat.getInstance(Locale.CHINA);
		NumberFormat frFormat = NumberFormat.getInstance(Locale.FRANCE);
		NumberFormat inFormat = NumberFormat.getInstance(new Locale("en", "in"));

		String us = usFormat.format(payment);
		String china = chFormat.format(payment);
		String france = frFormat.format(payment);
		String india = inFormat.format(payment);

		System.out.println("US: $" + us);
		System.out.println("India: Rs." + india);
		System.out.println("China: ￥" + china);
		System.out.println("France: " + france + " €");
	}
}
