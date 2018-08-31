package demojava.JavaLogicalProgramPractice;

import org.apache.commons.lang3.ArrayUtils;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 5, 3, 3, 6, 1, 2, 5 };
		int l = a.length;

		for (int i = 0; i < l; i++) {

			for (int j = 0; j < l - 1; j++) {

				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				} else if (a[j] == a[j + 1]) {

					a = ArrayUtils.remove(a, j);
					l = a.length;
				}
			}
		}
		for (int s : a) {
			System.out.println(s);
		}
	}
}
