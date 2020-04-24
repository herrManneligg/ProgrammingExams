package Exam2017;

public class ErrorsInMain {

	public static void main(String args[]) {
		int i = 0;
		boolean test = true;
		if (test) {
			int k = 3;
		}
		
//		3.b. There are no errors. The int k is instantiated with another value out of the scope of the "if" so it can be seen by the compiler.
//		The program prints 0, 2
		int k = 2;
		System.out.println(i);

//		3.a. The variable "k" is out of the scope of the method as it is instantiated in the "if" statement, hence it cannot be printed
		
		System.out.println(k);
	}
}
