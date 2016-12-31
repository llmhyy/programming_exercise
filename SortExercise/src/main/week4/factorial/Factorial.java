package week4.factorial;

public class Factorial {
	public static int result = 1;
	public static int input;
	public static void factorial(int limit){
		if (limit <= 0) {
			return;
		} else {
			result = result * limit;
			limit = limit - 1;
			factorial(limit);
		}
	}
	public static void main(String args[]){
		input = 4;
		if (input < 0){
			System.out.println("I don't think negative number has a factorial XD");
		} else {
			factorial(input);
			System.out.println(result);
		}
	}
}
