package Exam2017;

public class Loops {

	public static void main(String[] args) {
		
		System.out.println("The sum from 1 to 100 with for loop equals " + forLoop(100));
		System.out.println("The sum from 1 to 100 with while loop equals " + whileLoop(100));
		System.out.println("The sum from 1 to 100 with do-while loop equals " + doWhileLoop(100));

	}

	
	// Do while loop
	private static int doWhileLoop(int limit) {

		int result = 0;
		int i = 0;
		
		do {
			result += i;
			i++;
			
		} while (i <= limit);
		return result;
	}

	// while loop
	private static int whileLoop(int limit) {
		
		int result = 0;
		int i = 0;
		
		while (i <= limit) {
			result += i;
			i++;
		}
		return result;
	}

	// for loop
	public static int forLoop(int limit) {

		int result = 0;

		for (int i = 0; i <= limit; i++) {
			result += i;
		}
		return result;
	}
}
