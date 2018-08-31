package demojava.JavaLogicalProgramPractice;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class AbstractDateTime {

	public static String getDay(String day, String month, String year) {
		LocalDate lc = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		return lc.getDayOfWeek().toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String month = sc.next();
		String day = sc.next();
		String year = sc.next();

		String gd = getDay(day, month, year);
		System.out.println(gd);
	}
}
