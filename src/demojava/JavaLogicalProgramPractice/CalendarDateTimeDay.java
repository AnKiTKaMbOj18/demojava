package demojava.JavaLogicalProgramPractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDateTimeDay {

	public static String getDay(String day, String month, String year) {

		int d = Integer.parseInt(day);
		int m = Integer.parseInt(month) - 1;
		int y = Integer.parseInt(year);

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m);
		c.set(Calendar.DAY_OF_MONTH, d);

		Date date = c.getTime();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dt = df.format(date);

		return dt.toUpperCase();
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
