package Exam2018;

public class SumNUsingRecursion {
	
//	Really easy recursion exercise. It is really similar to the
//	recursion algorithm for calculating the factorial numbers (asked in Exam2016).

	public static void main(String[] args) {

		System.out.println(calculateSum(10));
	}

	public static int calculateSum(int number) {
		
		if (number == 1) {
			return 1;
		}
		
		return number + calculateSum(number - 1);
	}
}
