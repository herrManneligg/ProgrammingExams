package Exam2018;

public class ExerciseThree {

	public static void main(String[] args) {

		int k = 10, l = 10;
//		boolean a, b, c;
		boolean test;
		String alpha;
		String beta;

//	QUESTION A.
//	Consider the following statement, written after k and l have been assigned a value, in the same program:

		test = k > l ? false : true;

//	What is the value of test if the value of k is greater than the value of l? And what is the value of test if k and l have been assigned the same value?		

//	ANSWER.
//		The previous statement is a ternary operator. The ternaty operator works as a simplified "if" statement, and follows the following structure:

//		<condition> ? <if condition is true, return this> : <if condition is false, return this>;

//		Hence, if the value of <k> is greater than the value of <l>, the value of test will be "false". If both have the same value, the result will be true
//		since the condition "k > l" will not be true. Below a print statement proving this.

		System.out.println("If <k> and <l> have the same value, test is: " + test + ".");

//	QUESTION B.
//		Consider the following statement:

//		test = a && b && c;

// 		Write the value of test for all possible values of a, b and c (there are eight possible combinations).

//	 			|	  a		|	  b		|	  c		| 	test
//				-----------------------------------------------
//			 	|	false	|	false	|	false	|	false
//				|	false	|	false	|	true	|	false
//				|	false	|	true	|	false	|	false
//			 	|	false	|	true	|	true	|	false
//			 	|	true	|	false	|	false	|	false
//				|	true	|	false	|	true	|	false
//			 	|	true	|	true	|	false	|	false
//				|	true	|	true	|	true	|	true

//		The following table corresponds to boolean algebra and logic circuits. Below print statements that will prove this.
//		It will check if all values are true; if so, then the result will be true. False otherwise.
//		More info in https://drstienecker.com/tech-332/3-logic-circuits-boolean-algebra-and-truth-tables/

		System.out.println("\n|   a	|   b	|   c	|  test");
		System.out.println("---------------------------------");

		boolean a = false;
		boolean b = false;
		boolean c = false;

		System.out.println("| false	| false	| false	|  " + (a && b && c));

		a = false;
		b = false;
		c = true;

		test = a && b && c;

		System.out.println("| false	| false	| true	|  " + test);

		a = false;
		b = true;
		c = false;

		test = a && b && c;

		System.out.println("| false	| true	| false	|  " + test);

		a = false;
		b = true;
		c = true;

		test = a && b && c;

		System.out.println("| false	| true	| true	|  " + test);

		a = true;
		b = false;
		c = false;

		test = a && b && c;

		System.out.println("| true	| false	| false	|  " + test);

		a = true;
		b = false;
		c = true;

		test = a && b && c;

		System.out.println("| true	| false	| true	|  " + test);

		a = true;
		b = true;
		c = false;

		test = a && b && c;

		System.out.println("| true	| true	| false	|  " + test);

		a = true;
		b = true;
		c = true;

		test = a && b && c;

		System.out.println("| true	| true	| true	|  " + test);

//	QUESTION C.
//	Explain the difference between these operations.

//		k / l;
//		k % l;
//		k / (double)l;

//		k / l 
//		A simple integer division. The result will discard the remaining and round up the number.
//		So, if k is 1 and l is 2, the result will be 0 instead of 0.5
		
//		k % l;
//		Integer division but this time the result would be the remainder from k / l.
//		If k is 1 and l is 2, the result will be 5 instead of 0.5
		
//		k / (double)l;
//		This integer division casts the value of "l" into double, so the result would be 0.5
		
//	QUESTION D.
//	Explain the difference between the following two operations:
//		k + l;
//		This is a math's calculation of two numbers.
		
//		alpha + beta;
//		This is a string concatenation of two texts of the object String. In this case, Java creates a new object 
//		that contains the characters of alpha and beta String objects.
	}
}
