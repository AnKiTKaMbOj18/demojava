package demojava;

public class Recursion1 {

	public static void main(String[] args) {
		
		System.out.println(calculate(6));
	}
	
	public static int calculate(int value) {

		//System.out.println("hello " + value);
		
		if(value==1) {
			return 1;
		}
		
		return calculate(value - 1) * value;
	}

}
