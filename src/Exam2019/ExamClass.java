package Exam2019;

public class ExamClass {

	public static String makeString(int a, double b) {
		String s = "";
		s = String.format("a is %d, and b is %5.2f", ++a, b);
		return s;
	}

	public static void main(String[] args) {
		int a = 4;
		double aDouble = 3.141529;
		String formatted = makeString(a, aDouble); // Line B
		System.out.println(formatted); // Line A
		System.out.println(a); // Line C
//		System.out.println(b); // Line D
		
//	QUESTION A. The error is in line D; the code will not compile because the variable "b"
//				has not been created.
		
//	QUESTION B. public. Means that the method can be seen by all classes in this project.
//				static. Means that this method does not need to be created within a class
//						for it being used.
//				String. Means that this method must return a variable of type String.
	
//	QUESTION C. The Line A will output:
//				"a is 5, and b is 3.14"

//	QUESTION D. If changed, it will first print, then increment "a",
//				as the operators are after the program reads the value.
//				So the program would print: "a is 4, and b is 3.14"

//	QUESTION E. If it was not static, I would need to instantiate a ExamClass Object to 
//				call the method, like this:
		
//				ExamClass ex = new ExamClass();
//				String formatted = ex.makeString(a, aDouble); // Line B
		
//	QUESTION F. The output would be 4.
	}
}
