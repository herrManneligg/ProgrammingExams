package Exam2016;

public class BooleanTests {

	public static void main(String[] args) {
		
		boolean test;
		boolean a = true;
		boolean b = false;
		
		test = a && b;
		System.out.println("test = a && b = " + test);
		
		test = a || b;
		System.out.println("test = a || b = "  + test);
		
		test = a && !b;
		System.out.println("test = a && !b = "  + test);
		
		test = !a && b;
		System.out.println("test = !a && b = "  + test);
		
		test = !(a && b);
		System.out.println("test = !(a && b) = "  + test);
	}
}
