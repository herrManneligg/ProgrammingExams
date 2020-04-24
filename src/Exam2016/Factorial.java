package Exam2016;

public class Factorial {
	
	public static void main(String[] args) {
		
		System.out.println(factorial(10));
	}
	
	// Recursive algorithm for getting the factorial of the specified number.
	public static int factorial(int number) {
		if (number == 1) {
			return number;
		} else {
			number = number * factorial(number-1);
		}
		return number;
	}

}
