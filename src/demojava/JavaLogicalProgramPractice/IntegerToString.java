package demojava.JavaLogicalProgramPractice;

import java.util.Scanner;

public class IntegerToString {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any integer");
		
		int n=sc.nextInt();
		 sc.close();
		 String s=Integer.toString(n);
		 //System.out.println(s);
		 
		 if(n==Integer.parseInt(s)){
			 System.out.println("Good job" +n);
			 System.out.println("String"+s);
		 }
		 else
			 System.out.println("bad work");
	}
}
