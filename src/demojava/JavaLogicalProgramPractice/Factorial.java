package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=Integer.parseInt(sc.nextLine());
		
		int factorial=1;
		int i=1;
		
		while(i<=number) {
			
			factorial=factorial*i;
			
			i++;
		}
		System.out.println("factorial of "+number +" is "+factorial);
	}

}
